package com.wt.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * web.xml
 *  <filter>
 *      <filter-name>struts2</filter-name>
 *      <filter-class>com.wt.filter.CustomFilter</filter-class>
 *  </filter>
 *
 *  <filter-mapping>
 *      <filter-name>struts2</filter-name>
 *      <url-pattern>/*</url-pattern>
 *  </filter-mapping>
 */
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("......CustomFilter初始化方法");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("......CustomFilter doFilter方法");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("......CustomFilter 销毁");
    }
}
