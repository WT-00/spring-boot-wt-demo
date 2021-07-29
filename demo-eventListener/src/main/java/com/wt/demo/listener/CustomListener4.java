package com.wt.demo.listener;

import com.wt.demo.event.CustomEvent;
import org.springframework.context.ApplicationListener;


/**
 *
 */
public class CustomListener4 implements ApplicationListener<CustomEvent> {
    /**
     *
     * @param event
     */
    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustonListener4监听到了");
    }
}
