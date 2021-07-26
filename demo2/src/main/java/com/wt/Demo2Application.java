package com.wt;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.wt.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @SpringBootApplication
 * 声明我们的入口类  并且声明是springboot项目
 * @EnableConfigurationProperties({FoodConfig.class})
 * 告知主程序入口类 要自动引入配置文件 配置文件对应的类作为参数
 */
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
@EnableEncryptableProperties
public class Demo2Application {

    //程序入口
    public static void main(String[] args) {
        //使用SpringApplication类的静态方法 启动springboot程序
        //方法的参数 程序的入口类 main函数的参数
        SpringApplication.run(Demo2Application.class,args);
    }
}