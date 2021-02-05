package com.itmao.restaurant.controller;

import com.itmao.restaurant.result.CommonResult;
import com.itmao.restaurant.service.ShowIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowIndexController {
    @Autowired
    private ShowIndexService showIndexService;

    @GetMapping(value = "/showindex/index")
    public CommonResult showindex(){
        return showIndexService.show();
    }
}
