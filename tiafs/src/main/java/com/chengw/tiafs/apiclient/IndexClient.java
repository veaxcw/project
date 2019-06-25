package com.chengw.tiafs.apiclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author chengw
 */
//@FeignClient("teacher-annual-info-report-system")
public interface IndexClient {

    @RequestMapping(value ="/api/teacherInfo",method = RequestMethod.GET)
    String teacherInfo();

}
