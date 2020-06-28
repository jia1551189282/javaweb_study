package com.jiajia.study.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 下午 5:29
 */

/**
 * 除了service 方法，其它方法都做了空处理
 */
public class GenericServletDemo  extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
