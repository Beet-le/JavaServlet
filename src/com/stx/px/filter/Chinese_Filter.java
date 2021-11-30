package com.stx.px.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "Chinese_Filter")
public class Chinese_Filter implements Filter {
    String encond=null;
    public void init(FilterConfig config) throws ServletException {
        encond = config.getInitParameter("encond");
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        if (encond!=null){
            request.setCharacterEncoding(encond);
            response.setCharacterEncoding(encond);
//            response.setContentType(encond);
        }
        chain.doFilter(request, response);
    }
}
