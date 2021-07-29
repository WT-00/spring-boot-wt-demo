package com.wt.demo;

import com.wt.demo.listener.CustomListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoEventlistenerApplication {

    public static void main(String[] args) {
        //第一种方式 绑定监听
        //获取启动的容器 加载自定义监听器
        ConfigurableApplicationContext context =SpringApplication.run(DemoEventlistenerApplication.class, args);
        context.addApplicationListener(new CustomListener1());
    }

}
