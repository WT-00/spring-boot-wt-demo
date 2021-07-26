package com.wt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @controller
 * 控制类 业务逻辑 请求分发 组装响应
 */
@Controller
public class HelloController {
    /**
     * @RequestMapping
     * 指定方法和请求之间的映射关系
     * @return
     * */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(1);
        return "test.html";
    }
}


