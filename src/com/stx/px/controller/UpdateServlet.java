package com.stx.px.controller;

import com.stx.px.dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdateServlet", value = "/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("stuid");
        int newid = Integer.parseInt(id);
        String name = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        UserDao dao=new UserDao();
        int i=dao.update(name,pwd,newid);
        if (i>0){
            response.sendRedirect("success.jsp");
        }else {
            response.sendRedirect("fail.jsp");
        }
    }
}
