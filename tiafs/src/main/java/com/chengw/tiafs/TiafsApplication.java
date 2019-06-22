package com.chengw.tiafs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author chengw
 */
@SpringBootApplication
@MapperScan(basePackages = "com.chengw.tiafs.dao")
@ServletComponentScan
@EnableEurekaClient
public class TiafsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiafsApplication.class, args);
    }

}
