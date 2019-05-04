package com.chengw.teacherInfoAnnualFillingSystem.controller;


import com.chengw.teacherInfoAnnualFillingSystem.model.Teacher;
import com.chengw.teacherInfoAnnualFillingSystem.services.TeacherService;
import main.util.VerifyCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {

    @Resource
    private TeacherService teacherService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        String username = request.getParameter("usercode");
        String password = request.getParameter("password");

        String verifyCode = String.valueOf(request.getSession().getAttribute("verCode"));

        String checkCode = request.getParameter("checkcode").toLowerCase();

        Teacher teacher = teacherService.getTeacherByUsername(username);

        if(/*checkCode.equals(verifyCode)*/true){//TODO
            if(username.equals(teacher.getUsername()) && password.equals(teacher.getPassword())){

                HttpSession session = request.getSession();
                session.setAttribute("teacher",teacher);//我觉得这么做不安全
                return  "index";
            }

            else
                return "error";

        }
        else
             return  "error";


    }

    @RequestMapping("/checkCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Progma","No-cache");
        response.setHeader("Cache-Control","no-cache");
        response.addDateHeader("Expires",0);
        response.setContentType("image/jpeg");

        //生成随机字符串
        String verifyCode = VerifyCodeUtil.generateVerifyCode(4);

        HttpSession session = request.getSession();

        session.removeAttribute("verCode");
        session.setAttribute("verCode",verifyCode.toLowerCase());

        VerifyCodeUtil.outputImage(100,30,response.getOutputStream(),verifyCode);


    }


}

