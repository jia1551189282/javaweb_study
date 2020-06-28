package com.jiajia.study.session;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 下午 4:16
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * 确保关闭了客户端之后 ，再次请求的时候的session 是一样的
 */

@WebServlet("/sessionDemo3")
public class SessionDemo3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1 获取session
        HttpSession session = req.getSession();
        // 2 创建Cookie对象
        Cookie cookie = new Cookie("JSESSIONID",session.getId());
        cookie.setMaxAge(60*60);
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

}
