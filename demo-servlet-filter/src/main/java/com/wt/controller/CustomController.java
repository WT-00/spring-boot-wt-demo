package com.wt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @RequestMapping("/hello")
    public String service(){
        System.out.println("CustomController执行了");
        return "hello servlet";
    }
}
