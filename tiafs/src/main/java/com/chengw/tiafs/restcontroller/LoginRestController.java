package com.chengw.tiafs.restcontroller;

import com.chengw.tiafs.common.MessageEntity;
import com.chengw.tiafs.services.AuthService;
import com.chengw.tiafs.util.RestfulUtil;
import com.chengw.tiafs.vo.LoginEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author chengw
 */
@RestController
@Slf4j
@RequestMapping("/api")
public class LoginRestController {

    @Resource
    private AuthService authService;

    @RequestMapping(value = "/login",method = RequestMethod.POST,produces ="application/json")
    public MessageEntity login(@RequestBody LoginEntity loginInfo, HttpServletRequest request) {
        log.info("验证登录");

        HttpSession session = request.getSession();
        String verCode = session.getAttribute("verCode").toString();

        if (verCode.equalsIgnoreCase(loginInfo.getCheckCode())) {
            if (authService.check(loginInfo)) {
                session.setAttribute("user", loginInfo);
                log.info("登录成功");
                return RestfulUtil.success(null);
            }else {
                return RestfulUtil.fail("用户名或者密码错误");
            }
        }else{
            return RestfulUtil.fail();
        }

    }

}
