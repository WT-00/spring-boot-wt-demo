package com.wt.controller;



import com.wt.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 业务控制类 返回视图
 */

@Controller
@RequestMapping("/guest")
public class GuestController {

  @Autowired
  private GuestService guestService;


    @GetMapping
    public String list(Model model) {
        model.addAttribute("guestList", guestService.getAllGuest());
        return "list";
    }



}
