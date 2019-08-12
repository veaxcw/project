package com.chengw.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 服务调用demo
 * @author chengw
 */
@FeignClient(value = "teacher-annual-info-report-system")
public interface HelloRemote {

    /**
     * 返回 GodDamn it
     * @return
     */
    @RequestMapping(value = "/tiafs/api/hello",method = RequestMethod.GET)
    String hello();


}
