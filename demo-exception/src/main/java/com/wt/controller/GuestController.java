package com.wt.controller;


import com.wt.entity.Guest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class GuestController {
    /**
     * 直接放在entity前面
     * 用来校验它是否符合规则
     * 校验不通过 直接返回失败
     * @param guest
     * @return
     */
    @ResponseBody
    @GetMapping("/guest")
    public String add(@Valid Guest guest, BindingResult result){
        if(result.getErrorCount()>0){
            List<FieldError> fieldErrors=result.getFieldErrors();
            StringBuffer stringBuffer=new StringBuffer();
            for(FieldError fieldError:fieldErrors){
                stringBuffer.append(fieldError.getField());
                stringBuffer.append("\t");
                stringBuffer.append(fieldError.getDefaultMessage());
                stringBuffer.append("\n");

            }
            return stringBuffer.toString();
        }
        return "success";
    }

    @RequestMapping("/er")
    public String error() throws Exception{
        throw new Exception("测试异常");
    }


    // get post put delete
}
