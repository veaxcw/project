package com.chengw.client.feign.iml;

import com.chengw.client.feign.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteImpl implements HelloRemote {
    @Override
    public String hello() {
        return "hello";
    }
}
