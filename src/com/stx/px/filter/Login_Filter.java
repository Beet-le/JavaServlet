package com.stx.px.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "Login_Filter")
public class  Login_Filter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req= (HttpServletRequest) request;
        HttpServletResponse rop=(HttpServletResponse)response;
        if (req.getSession().getAttribute("loginSession")!=null) {
            chain.doFilter(request, response);
        }else {
            rop.sendRedirect("login.jsp");
        }
    }
}
