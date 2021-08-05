package com.wt.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 方式二
 * 实现一个Filter接口
 * 在类上增加一个@WebFilter注解
 * 再入口类加上 @ServletComponentScan
 */
@WebFilter(filterName="customFilter2",urlPatterns = "/*")
public class CustomFilter2 implements Filter {

        @Override
        public void init(FilterConfig filterConfig) throws ServletException {
            System.out.println("......CustomFilter2初始化方法");
        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            System.out.println("......CustomFilter2 doFilter方法");
            filterChain.doFilter(servletRequest, servletResponse);
        }

        @Override
        public void destroy() {
            System.out.println("......CustomFilter2 销毁");
        }
}
