package com.itmao.restaurant.service;

import com.itmao.restaurant.result.CommonResult;
import org.springframework.stereotype.Component;

@Component
public class ShowFallbackService implements ShowService80{
    @Override
    public CommonResult showAllStaples() {
        return null;
    }

    @Override
    public CommonResult showAllDrinks() {
        return null;
    }

    @Override
    public CommonResult showStaple(int id) {
        return null;
    }

    @Override
    public CommonResult showDrink(int id) {
        return null;
    }
}
