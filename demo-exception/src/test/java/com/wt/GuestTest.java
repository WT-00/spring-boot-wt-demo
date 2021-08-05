package com.wt;

import com.wt.entity.Guest;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class GuestTest {

    public static void main(String[] args) {
        //普通模式
        Validator validator= Validation.buildDefaultValidatorFactory().getValidator();

        //快速失败模式
        Validator validator1=Validation.byDefaultProvider().
                configure().addProperty("hibernate.validator.fail_fast","true").
                buildValidatorFactory().getValidator();


        //创建一个不合格的entity
        Guest guest=new Guest("","保安");
        //开始验证
        Set<ConstraintViolation<Guest>> violations=validator.validate(guest);

        for(ConstraintViolation violation:violations) {
            System.out.println(violation.getPropertyPath() + "   " + violation.getMessage());
        }

        Set<ConstraintViolation<Guest>> violationSet=validator.validate(guest);
        for(ConstraintViolation violation:violationSet){
            System.out.println(violation.getPropertyPath()+"   "+violation.getMessage());

        }
    }

}
