package com.itmao.restaurant.controller;

import com.itmao.restaurant.result.CommonResult;
import com.itmao.restaurant.service.ShowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@SuppressWarnings("all")
@RequestMapping("/restaurant")
@Slf4j
public class ShowController {
    @Autowired
    private ShowService showService;
    @GetMapping("/showallstaples")
    public CommonResult showAllStaples(){
        return showService.showAllStaples();
    }
    @GetMapping("/showalldrinks")
    public CommonResult showAllDrinks(){
        return showService.showAllDrinks();
    }
    @PostMapping("/showstaplebyid/{id}")
    public CommonResult showStaple(@PathVariable("id") int id){
        return showService.showStapleByid(id);
    }
    @PostMapping("/showdrinkbyid/{id}")
    public CommonResult showDrink(@PathVariable("id") int id){
        return showService.showDrinkByid(id);
    }

}
