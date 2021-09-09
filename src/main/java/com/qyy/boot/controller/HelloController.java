package com.qyy.boot.controller;

import com.qyy.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2021/9/7 21:26
 * @Created by qyy
 */
@RestController
@RequestMapping
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping(value = "/hello")
    public String hello(){
        return " Spring boot 2.2 你好啊6666";
    }


//    @RequestMapping(value = "/car")
//    public Car car(){
//        return car;
//    }

}
