package com.wt.error;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyException {

    @ExceptionHandler(Exception.class)
    public ModelAndView handle(Exception e) throws Exception{
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/error");
        return modelAndView;
    }

}
