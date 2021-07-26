package com.wt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @Controller 是视图层使用到的注解
 * @RestController 是返回json数据时使用的注解
 */

@Controller
public class FTLController {
    public static int i=1;

   @RequestMapping("/hello")
    public String index(Model model){
        System.out.println(i++);
        model.addAttribute("now",new Date().toString());
        return "/freemarker/wel";

    }
}
