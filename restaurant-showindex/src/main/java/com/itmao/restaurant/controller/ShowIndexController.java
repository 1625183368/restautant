package com.itmao.restaurant.controller;


import com.itmao.restaurant.result.CommonResult;
import com.itmao.restaurant.service.ShowIndexService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class ShowIndexController {
    @Autowired
    private ShowIndexService showIndexService;

    @RequestMapping(value = "/restaurant/showindex")
    public CommonResult showindex(){
        return showIndexService.showindex();
    }
}
