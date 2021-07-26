package com.wt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/root")
@Controller()
public class TestController {

    @ResponseBody
    @RequestMapping("test")
    public String test(Model model){
        model.addAttribute("name","张三");
        return "嘻嘻嘻";


    }

}
