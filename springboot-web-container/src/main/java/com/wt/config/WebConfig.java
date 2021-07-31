package com.wt.config;


import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 通过一个类设置tomcat属性
 * 在bean容器中设置tomcat参数的优先级高于在配置文件中配置
 *
 */

//@Configuration
public class WebConfig {

//    @Bean
//    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> customizer(){
//
//        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
//            @Override
//            public void customize(ConfigurableWebServerFactory factory) {
//                factory.setPort(8088);
//            }
//        };
//
//    }



}
