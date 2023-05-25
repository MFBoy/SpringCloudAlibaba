package com.zky.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "stock")
public class StockController {

    @RequestMapping(value = "/deduct")
    public String deduct(){
        System.out.println("入库成功！");
        return "入库成功！";
    }
}
