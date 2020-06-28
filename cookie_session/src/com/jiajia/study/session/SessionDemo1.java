package com.jiajia.study.session;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 下午 3:31
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * session 的基本使用
 */
@WebServlet("/sessionDemo1")
public class SessionDemo1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1 获取session
        HttpSession session = req.getSession();
        // 2 使用session 共享数据
        session.setAttribute("msg","hello");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
