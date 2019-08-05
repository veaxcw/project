package com.chengw.client.restctrl;

import com.chengw.client.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengw
 */
@RestController
public class IndexCtrl {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String hello(){
        return helloRemote.hello();
    }

}
