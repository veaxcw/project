package com.chengw.tiafs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author chengw
 */
@SpringBootApplication
@MapperScan(basePackages = "com.chengw.tiafs.dao")
@ServletComponentScan
public class TiafsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiafsApplication.class, args);
    }

}
