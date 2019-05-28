package com.chengw.tiafs.controller;

import com.chengw.tiafs.util.RequestUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chengw
 */
@RestController
@Slf4j
public class IndexController {

    @RequestMapping(value = "/")
    public void login( HttpServletResponse response){

        log.info("测试登录");
        RequestUtil.sendRedirect(response,"/signin.html");
    }

}
