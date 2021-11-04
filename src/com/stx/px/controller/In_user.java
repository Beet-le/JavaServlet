package com.stx.px.controller;

import com.stx.px.dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "In_user", value = "/In_user")
public class In_user extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        UserDao user = new UserDao();
        int i = user.inu(name, pwd);
        if (i > 0) {
            response.sendRedirect("success.jsp");
        } else {
            response.sendRedirect("fail.jsp");
        }
    }
}
