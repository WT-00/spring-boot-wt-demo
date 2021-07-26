package com.wt.controller;


import com.wt.bean.Guest;
import com.wt.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 业务控制类 返回视图
 */

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;


    @RequestMapping("/guest/list")
    public String list(Model model){
        model.addAttribute("guestList",guestService.list());
        return "list";
    }


    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/guest/add")
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/toUpdate")
    public String toUpdate(){
        return "update";
    }

    @RequestMapping("/guest/update")
    public String update(Guest guest){
            guestService.update(guest);
        return "redirect:/guest/list";
    }

}
