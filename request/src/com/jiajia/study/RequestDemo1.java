package com.jiajia.study;

/**
 * @author ZJJ
 * @date 2020/6/29 0029 下午 5:17
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * request 对象获取请求行信息
 */
@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取请求方式
        String method = request.getMethod();
        System.out.println("请求方式：" + method);
        // 2.获取虚拟目录
        String contextPath = request.getContextPath();
        System.out.println("虚拟目录：" + contextPath);
        // 3. 获取请求路径
        String servletPath = request.getServletPath();
        System.out.println("获取请求路径：" + servletPath);
        // 4. 获取请求参数
        String queryString = request.getQueryString();
        System.out.println("请求参数：" + queryString);
        // 5. 获取请求uri url
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("uri:" + requestURI + ",url:" + requestURL);
        // 6. 获取协议以及版本
        String protocol = request.getProtocol();
        System.out.println("协议以及版本" + protocol);
        // 7 获取客户机的ip地址：
        String remoteAddr = request.getRemoteAddr();
        System.out.println("客户端的ip:" + remoteAddr);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
