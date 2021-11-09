package com.stx.px.controller;

import com.stx.px.dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DelServlet", value = "/DelServlet")
public class DelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        int newid = Integer.parseInt(id);
        UserDao user=new UserDao();
        int i = user.del_user(newid);
        if (i>0){
            response.sendRedirect("success.jsp");
        }else {
            response.sendRedirect("fail.jsp");
        }
    }
}
