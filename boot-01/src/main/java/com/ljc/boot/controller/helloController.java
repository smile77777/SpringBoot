package com.ljc.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @RequestMapping("/hello")
    public String handle(){
        return "Hello SpringBoot2!"+"你好";
    }
}
