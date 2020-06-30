package com.jiajia.study.filter.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 下午 4:54
 */

/**
 *servlet 入门程序
 */
public class ServletDemo1 implements Servlet {
    /**
     * 初始化的时候执行
     * 一般用来加载资源
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务逻辑处理的方法
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("服务器被访问");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 服务器关闭的时候执行，先于服务器关闭
     * 一般用来释放资源
     */
    @Override
    public void destroy() {

    }
}
