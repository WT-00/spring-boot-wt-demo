package com.wt.controller;


import com.wt.bean.Food;
import com.wt.bean.Vegetables;
import com.wt.config.FoodConfig;
import com.wt.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @RestController 是@Controller和@ResponseBody的结合
 * 是返回json形式的响应结果  而不是视图view
 */

@RestController
public class JsonController {


    //    /**
//     *
//     */
    @Value("${food.name}")
    private String name;
    @Value("${food.price}")
    private Float price;

    @Autowired
    private FoodConfig foodConfig;
    @Autowired
    private VegetablesConfig vegetablesConfig;

//    @Value("${user.username}")
//    private String username;
//    @Value("${user.password}")
//    private String password;
//
//    @Value("${a.b}")
//    private  String str;

    @RequestMapping("json")
    public Food json() {
        Food food = new Food(foodConfig.getName(), foodConfig.getPrice(), foodConfig.getSauce());
        System.out.println(price);
        System.out.println(name);
        return food;
    }


    @RequestMapping("/vegetables")
    public Vegetables vegetables() {
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplane(vegetablesConfig.getEggplane());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        return vegetables;
    }


//    @RequestMapping("jasypt")
//    public String jasypt(){
//        StringBuffer buffer=new StringBuffer();
//        buffer.append(username);
//        buffer.append("\t");
//        buffer.append(password);
//        return buffer.toString();
//    }


}
