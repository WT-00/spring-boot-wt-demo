package com.wt.controller;


import com.wt.bean.Guest;
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
        model.addAttribute("guestList", guestService.list());
        return "list";
    }


    @GetMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    @PostMapping
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:/guest";
    }

    /**
     * 将/guest/toUpdate/{name}格式的url映射带此方法
     * 其中的name属性值  通过注解 @PathVariable("name")映射到此方法的属性中
     * 其中name 代表url中查找的属性值
     *
     * @param model
     * @param name
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name) {
        Guest guest = guestService.get(name);
        model.addAttribute("guest", guest);
        return "update";
    }

    @PutMapping
    public String update(Guest guest) {
        guestService.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name) {
        guestService.delete(name);
        return "redirect:/guest";
    }

}
