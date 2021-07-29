package com.wt.demo.listener;

import com.wt.demo.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


/**
 * 方式三
 * 不需要事先ApplicationListener<>接口
 * 但是先声明当前类是@Component主键 需要被加载
 * 通过在方法上架一个@EventListener注解 声明这是一个监听主键
 *  监听的事件是方法
 */

@Component
public class CustomListener3  {

    @EventListener
    public void EventListener(CustomEvent event){
        event.printMessage("CustomListener3监听到了");
    }

}
