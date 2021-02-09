package com.itmao.restaurant.service;

import com.itmao.restaurant.entities.Drink;
import com.itmao.restaurant.result.CommonResult;

public interface ShowService {

    CommonResult showAllDrinks();
    CommonResult showAllStaples();
    CommonResult showStapleByid(int id);
    CommonResult showDrinkByid(int id);


}
