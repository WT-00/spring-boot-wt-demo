package com.wt.demo4.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FTLController {

    @RequestMapping("/test")
    public String index(Model model){
        model.addAttribute("name","张三");
        return "test";
    }
}
