package com.chengw.tiafs.controller;


import com.chengw.tiafs.services.TeacherService;
import com.chengw.tiafs.util.RequestUtil;
import com.chengw.tiafs.util.VerifyCodeUtil;
import com.chengw.tiafs.vo.LoginEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author chengw
 */
@Controller
@RequestMapping(value = "/api")
@Slf4j
public class CommonController {

    @Resource
    private TeacherService teacherService;

    @RequestMapping(value = "/index")
    public void index(HttpServletRequest request, HttpServletResponse response){
        log.info("显示主页");

        RequestUtil.sendRedirect(response,"/index.html");
    }

    @RequestMapping(value = "/checkCode",method = RequestMethod.GET)
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

