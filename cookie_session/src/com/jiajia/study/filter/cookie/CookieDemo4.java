package com.jiajia.study.filter.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 下午 3:03
 */
@WebServlet("/cookieDemo4")
public class CookieDemo4 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // 1 创建cookie
        Cookie cookie = new Cookie("msg","setMaxAge");
        // 2 设置存活时间
        // 2.1 大于0的数，会将cookie持久化到硬盘,到了时间就删除
        //cookie.setMaxAge(30);
        // 2.2 等于0,会删除cookie
//        cookie.setMaxAge(0);
        // 2.3 小于0,默认值，关闭浏览器就失效
        // 3 发送cookie
        resp.addCookie(cookie);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
