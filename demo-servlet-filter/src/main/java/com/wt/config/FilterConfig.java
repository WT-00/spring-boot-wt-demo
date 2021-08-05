package com.wt.config;

import com.wt.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CustomFilter> filterRegistrationBean(){

        FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean=
                new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new CustomFilter());
        //设置过滤规则
        filterFilterRegistrationBean.addUrlPatterns("/*");
//        filterFilterRegistrationBean.setOrder(0); //决定注册的优先级

        return filterFilterRegistrationBean;
    }
}
