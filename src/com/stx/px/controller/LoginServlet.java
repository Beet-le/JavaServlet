package com.stx.px.controller;

import com.stx.px.dao.UserDao;
import com.stx.px.modle.UserModle;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String pwd = request.getParameter("pwd");

        UserDao user = new UserDao();
        UserModle modle = user.login(name, pwd);
    }
}
