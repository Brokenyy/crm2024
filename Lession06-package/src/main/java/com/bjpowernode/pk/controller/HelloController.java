package com.bjpowernode.pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Description:
 * Author:    Dane
 * CreateTime:2024/10/29-下午3:55
 * Since  :   1.0
 * Version:   1.0
 */
@RestController
public class HelloController {
    @Autowired
    private Date date;


    @GetMapping("/hello")
    public String hello(){
        return "=----===欢迎使用springboot3"+date;
    }

}
