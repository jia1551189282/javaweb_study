package com.jiajia.study;

/**
 * @author ZJJ
 * @date 2020/6/29 0029 下午 5:43
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 获取请求头数据 ，判断浏览器类型
 */
@WebServlet("/requestDemo3")
public class RequestDemo3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String header = request.getHeader("user-agent");
        if(header.contains("Chrome")){
            System.out.println("google访问");
        }else if(header.contains("firefox")){
            System.out.println("火狐访问");
        }else {
            System.out.println("其它浏览器访问");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
