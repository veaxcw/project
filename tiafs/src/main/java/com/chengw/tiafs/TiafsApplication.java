package com.chengw.tiafs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author chengw
 */
@SpringBootApplication
@MapperScan(basePackages = "com.chengw")
//@EnableEurekaClient
public class TiafsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiafsApplication.class, args);
    }

}
