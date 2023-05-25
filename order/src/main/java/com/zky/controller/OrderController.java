package com.zky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add")
    public String order(){
        System.out.println("下单成功！");
        String msg = restTemplate.getForObject("http://localhost:8082/stock/deduct", String.class);
        System.out.println(msg);
        return "下单成功！" + msg;
    }
}