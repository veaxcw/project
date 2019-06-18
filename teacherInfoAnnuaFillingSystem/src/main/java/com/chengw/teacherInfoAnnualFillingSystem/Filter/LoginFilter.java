package com.chengw.teacherInfoAnnualFillingSystem.Filter;



import com.chengw.teacherInfoAnnualFillingSystem.model.Teacher;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author chengw
 */
public class LoginFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        String requestURI = request.getRequestURI();

        if ("/demo_1_war_exploded/login".equals(requestURI) || "/demo_1_war_exploded/checkCode".equals(requestURI)
                || requestURI.contains("images")
                || requestURI.contains("img")
                || requestURI.contains("Scripts")
                || requestURI.contains("Styles")){
            chain.doFilter(request, response);
        } else {
            HttpSession session = request.getSession();
            Teacher teacher = (Teacher) session.getAttribute("teacher");
            if (teacher != null) {
                chain.doFilter(request, response);
            } else {
                request.getRequestDispatcher("login.jsp").forward(request,response);
                /*response.sendRedirect("login.jsp");
                * 搞清楚重定向和forward的区别，搞不清楚 别下**写*/
            }
        }
    }

    public void destroy() {

    }
}
