package com.ljc.boot.controller;

import com.ljc.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @Autowired
    Car car;

    @RequestMapping("/mycar")
    public Car mycar(){
        return car;
    }

    @RequestMapping("/hello")
    public String handle(){
        return "Hello SpringBoot2!"+"你好";
    }
}
