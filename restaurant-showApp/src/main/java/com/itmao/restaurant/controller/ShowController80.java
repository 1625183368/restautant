package com.itmao.restaurant.controller;

import com.itmao.restaurant.result.CommonResult;

import com.itmao.restaurant.service.ShowService80;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ShowController80 {
    @Autowired
    private ShowService80 showService80;
    @HystrixCommand
    @GetMapping("/staples")
    public CommonResult showAllStaples(){
        return showService80.showAllStaples();
    }

    @GetMapping("/drinks")
    public CommonResult showAllDrinks(){
        return showService80.showAllDrinks();
    }
    @PostMapping("/staple/{id}")
    public CommonResult showStaple(@PathVariable("id") int id){
        return showService80.showStaple(id);
    }
    @PostMapping("/drink/{id}")
    public CommonResult showDrink(@PathVariable("id") int id){
        return showService80.showDrink(id);
    }

}
