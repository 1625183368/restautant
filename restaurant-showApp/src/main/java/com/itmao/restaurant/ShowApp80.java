package com.itmao.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableHystrix
//@EnableFeignClients(basePackages = "com.itmao.restaurant.service")
@EnableFeignClients
public class ShowApp80 {
    public static void main(String[] args) {
        SpringApplication.run(ShowApp80.class,args);
    }
}
