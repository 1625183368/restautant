package com.itmao.restaurant.service.impl;

import com.itmao.restaurant.contants.drinkContants;
import com.itmao.restaurant.contants.stapleContants;
import com.itmao.restaurant.entities.Drink;
import com.itmao.restaurant.entities.R_Type;
import com.itmao.restaurant.entities.Staple;
import com.itmao.restaurant.mapper.ShowMapper;
import com.itmao.restaurant.result.CommonResult;
import com.itmao.restaurant.service.ShowService;
import com.itmao.restaurant.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Iterator;
import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    private ShowMapper showMapper;
    @Autowired
    @Qualifier("IRedis")
    private RedisTemplate redisTemplate;

    @Override
    public CommonResult showAllDrinks() {
        List<Drink> Cachedata = (List<Drink>) redisTemplate.opsForValue().get(drinkContants.DRINK_LIST_KEY);
        if (CollectionUtils.isEmpty(Cachedata)) {
            List<Drink> dbdata = null;
            dbdata = showMapper.getAllDrinks();
            if (!CollectionUtils.isEmpty(dbdata)) {
                redisTemplate.opsForValue().set(drinkContants.DRINK_LIST_KEY, dbdata);
//                String dbdata = JsonUtils.objectToJson(drinks);
                return new CommonResult(200, "查询数据库成功", dbdata);
            }
            return new CommonResult(500,"查询失败");
        }
//        String Cachedata = JsonUtils.objectToJson(data);
        return new CommonResult(200,"查询缓存成功",Cachedata);
    }

    @Override
    public CommonResult showAllStaples() {
        List<Staple> Cachedata = (List<Staple>) redisTemplate.opsForValue().get(stapleContants.STAPLE_LIST_KEY);
        if (CollectionUtils.isEmpty(Cachedata)) {
            List<Staple> dbdata = null;
            dbdata = showMapper.getAllStaples();
            if (!CollectionUtils.isEmpty(dbdata)) {
                redisTemplate.opsForValue().set(stapleContants.STAPLE_LIST_KEY,dbdata);
//                String dbdata = JsonUtils.objectToJson(staples);
                return new CommonResult(200, "查询数据库成功", dbdata);
            }
            return new CommonResult(500,"查询失败");
        }
//        String Cachedata = JsonUtils.objectToJson(data);
        return new CommonResult(200,"查询缓存成功",Cachedata);
        }

    @Override
    public CommonResult showStapleByid(int id) {
        Staple Cachedata = (Staple) redisTemplate.opsForValue().get(stapleContants.STAPLE_KEY+id);
        if(Cachedata!=null){
            return new CommonResult(200,"成功(缓存数据)",Cachedata);
        }
        Staple dbdata = null;
        dbdata = showMapper.getStapleById(id);
        if (dbdata!=null){
            redisTemplate.opsForValue().set(stapleContants.STAPLE_KEY+id,dbdata );
            return new CommonResult(200,"成功(数据库数据)",dbdata);
        }
        return new CommonResult(500,"没有数据");
    }

    @Override
    public CommonResult showDrinkByid(int id) {
        Drink Cachedata = (Drink) redisTemplate.opsForValue().get(drinkContants.DRINK_KEY+id);
        if(Cachedata!=null){
            return new CommonResult(200,"成功(缓存数据)",Cachedata);
        }
        Drink dbdata = null;
        dbdata = showMapper.getDrinkById(id);
        if (dbdata!=null){
            redisTemplate.opsForValue().set(drinkContants.DRINK_KEY+id,dbdata,2592000);
            return new CommonResult(200,"成功(数据库数据)",dbdata);
        }
        return new CommonResult(500,"没有数据");
    }
}

