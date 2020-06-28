package com.jiajia.study.cookie;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 下午 2:56
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 细节1 ：可以添加多个cookie
 */
@WebServlet("/cookieDemo3")
public class CookieDemo3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1 创建cookie对象
        Cookie c = new Cookie("msg1","hello");
        Cookie c1 = new Cookie("msg2","hello2");
        // 2 添加cookie
        resp.addCookie(c);
        resp.addCookie(c1);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
