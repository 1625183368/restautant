package com.itmao.restaurant.service;

import com.itmao.restaurant.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@FeignClient(value = "CLOUD-SHOWINDEX-SERVICE",fallback = ShowFallbackService.class)
public interface ShowService80 {
    @GetMapping("/restaurant/showallstaples")
    public CommonResult showAllStaples();
    @GetMapping("/restaurant/showalldrinks")
    public CommonResult showAllDrinks();
    @PostMapping("/restaurant/showstaplebyid/{id}")
    public CommonResult showStaple(@PathVariable("id") int id);
    @PostMapping("/restaurant/showdrinkbyid/{id}")
    public CommonResult showDrink(@PathVariable("id") int id);

}
