package com.jiajia.study.cookie;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 下午 2:51
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 获取cookie
 */
@WebServlet("/cookieDemo2")
public class CookieDemo2  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie: cookies
             ) {
            String cookieKey = cookie.getName();
            String cookieValue = cookie.getValue();
            System.out.println(cookieKey + ":" + cookieValue);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
