package com.wt.controller;


import com.wt.entity.Restaurant;
import com.wt.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeController {


    @RequestMapping(value = "/thyme",method = RequestMethod.GET)
    public String index(Model model){
        Restaurant restaurant=new Restaurant();
        restaurant.setBoss("黄晓明");
        restaurant.setChef("凌大厨");
       model.addAttribute("restaurant",restaurant);
        return "/thymeleaf/thyme.html";
//        return "../static/a.html";
    }


    @RequestMapping("/login")
    public ModelAndView login(User user){
        System.out.println("a");
        ModelAndView modelAndView=new ModelAndView();
        if(user.getUsername().equals("zhangsan")){
            modelAndView.setViewName("welcome");
        }else {
            modelAndView.setViewName("thyme.html");
        }
        return modelAndView;
    }
}
