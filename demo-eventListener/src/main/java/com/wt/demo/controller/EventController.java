package com.wt.demo.controller;


import com.wt.demo.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventController {

    @Autowired
    private ApplicationEventPublisher publisher;

    @RequestMapping("/event")
    @ResponseBody
    public String event(){
        publisher.publishEvent(new CustomEvent(this));
        return "hello ";
    }


}
