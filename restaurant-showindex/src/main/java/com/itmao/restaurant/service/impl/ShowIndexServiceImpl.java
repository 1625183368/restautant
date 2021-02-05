package com.itmao.restaurant.service.impl;


import com.itmao.restaurant.contants.stapleContants;
import com.itmao.restaurant.entities.Staple;
import com.itmao.restaurant.mapper.ShowIndexMapper;
import com.itmao.restaurant.result.CommonResult;
import com.itmao.restaurant.service.ShowIndexService;
import com.itmao.restaurant.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@SuppressWarnings("all")
public class ShowIndexServiceImpl implements ShowIndexService {
    @Autowired
    private ShowIndexMapper showIndexMapper;

    @Autowired
    @Qualifier("MyRedis")
    private RedisTemplate redisTemplate;

    @Override
    public CommonResult showindex() {
        List<Staple> data = (List<Staple>) redisTemplate.opsForValue().get(stapleContants.STAPLE_LIST_KEY);
        if(CollectionUtils.isEmpty(data)) {
            List<Staple> staples = null;
            staples = showIndexMapper.getStaples();
            if (!CollectionUtils.isEmpty(staples)) {
                redisTemplate.opsForValue().set(stapleContants.STAPLE_LIST_KEY,staples);//三十天过期
                String dbdata = JsonUtils.objectToJson(staples);
                return new CommonResult(200, "成功(数据库数据)", dbdata);
            }
            return new CommonResult(400, "没有数据");
        }
        String Cachedata = JsonUtils.objectToJson(data);
        return new CommonResult(200,"成功(缓存数据)",Cachedata);
    }
}
