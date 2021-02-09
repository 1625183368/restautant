package com.itmao.restaurant.mapper;

import com.itmao.restaurant.entities.Drink;
import com.itmao.restaurant.entities.Staple;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShowMapper {
    List<Staple> getAllStaples();
    List<Drink> getAllDrinks();
    Staple getStapleById(@Param("id") int id);
    Drink getDrinkById(@Param("id") int id);
}
