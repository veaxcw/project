package com.bilibili.main.controller;

import com.bilibili.main.utils.VerfiCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UtilsController {

    @RequestMapping("checkCode")
    public void checkCode(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setHeader("Progma","No-cache");
        response.setHeader("Cache-Control","no-cache");
        response.setDateHeader("Expires",0);
        response.setContentType("image/jpeg");

        String verifyCode = VerfiCodeUtil.generateVerifyCodes(4);

        request.getSession().removeAttribute("verifyCode");
        request.getSession().setAttribute("verifyCode",verifyCode.toLowerCase());

        VerfiCodeUtil.outputImage(100,30,response.getOutputStream(),verifyCode);

    }
}
