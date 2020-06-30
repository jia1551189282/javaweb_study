package com.jiajia.study.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * @author ZJJ
 * @date 2020/6/30 0030 上午 8:56
 */

/**
 * filter 入门操作
 */
@WebFilter("/*")  // 访问所有的资源前都会执行过滤器
public class FilterDemo1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("服务器启动的时候执行");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            System.out.println("过滤器执行，在访问资源之前，可以对request做操作，增强功能");
            // 放行
            filterChain.doFilter(servletRequest,servletResponse);
            System.out.println("访问资源之后执行，可以对response操作，增强功能");
    }

    @Override
    public void destroy() {
        System.out.println("服务器关闭的时候执行");
    }
}
