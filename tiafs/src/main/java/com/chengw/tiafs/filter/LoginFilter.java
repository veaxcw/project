package com.chengw.tiafs.filter;


import com.chengw.tiafs.model.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author chengw
 */
//@Configuration
@Slf4j
public class LoginFilter implements Filter {

    private final static  String URL = "/tiafs/";

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        log.info("拦截器测试");

        String requestURI = request.getRequestURI();
        chain.doFilter(request, response);


//        if (URL.equals(requestURI)
//                || requestURI.contains("images")
//                || requestURI.contains("img")
//                || requestURI.contains("Scripts")
//                || requestURI.contains("Styles")){
//            chain.doFilter(request, response);
//        } else {
//            HttpSession session = request.getSession();
//            Teacher teacher = (Teacher) session.getAttribute("teacher");
//            if (teacher != null) {
//                chain.doFilter(request, response);
//            } else {
//                request.getRequestDispatcher("signin.html").forward(request,response);
//            }
//        }
    }

    @Override
    public void destroy() {

    }
}
