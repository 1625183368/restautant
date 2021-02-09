package com.itmao.restaurant.mapper;

import com.itmao.restaurant.entities.Drink;
import com.itmao.restaurant.entities.Staple;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShowIndexMapper {
    public List<Staple> getStaples();
}
