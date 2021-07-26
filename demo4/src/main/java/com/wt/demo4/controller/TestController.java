package com.wt.demo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/thy")
    public String thyme(Model model){
        System.out.println(1);
        model.addAttribute("name","张三");
        return "thyme";

    }

}
