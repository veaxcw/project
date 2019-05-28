package com.chengw.tiafs.controller;



import com.chengw.tiafs.model.Teacher;
import com.chengw.tiafs.services.TeacherService;
import com.chengw.tiafs.util.VerifyCodeUtil;
import com.chengw.tiafs.vo.LoginEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author chengw
 */
@RestController
@RequestMapping(value = "/api")
@Api
public class LoginController {

    @Resource
    private TeacherService teacherService;

    @RequestMapping(value = "/login",produces = "application/json")
    @ApiOperation(value = "登陆",notes = "登陆",produces = "json")
    public String login(@RequestBody LoginEntity login,HttpServletRequest request){

          String username = login.getUserName();
          String password = login.getPassword();

        Teacher teacher = teacherService.getTeacherByUsername(username);

        //TODO
        if(/*checkCode.equals(verifyCode)*/true){
            if(username.equals(teacher.getUserName()) && password.equals(teacher.getPassword())){

                HttpSession session = request.getSession();
                //我觉得这么做不安全
                session.setAttribute("teacher",teacher);
                return  "index";
            }
            else {
                return "error";
            }
        }
        else {
            return  "error";
        }


    }

    @RequestMapping(value = "/checkCode",method = RequestMethod.POST)
    @ApiOperation(value = "验证码",notes = "验证码")
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

