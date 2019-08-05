package com.chengw.tiafs.restctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengw
 */
@RestController
@RequestMapping(value = "/api")
public class HelloRestCtrl {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "God Damn it";
    }

}
