package com.chengw.tiafs;

import com.chengw.tiafs.config.cookie.CookieConfigProperties;
import com.chengw.tiafs.config.cookie.TokenConfigProperties;
import com.chengw.tiafs.config.security.JwtConfigProperties;
import com.chengw.tiafs.util.JwtTokenUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;


/**
 * @author chengw
 */
@SpringBootApplication
@MapperScan(basePackages = "com.chengw")
@EnableConfigurationProperties({
        JwtConfigProperties.class,
        CookieConfigProperties.class,
        TokenConfigProperties.class
})
//@EnableEurekaClient
public class TiafsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiafsApplication.class, args);
    }

    @Bean
    public JwtTokenUtil jwtTokenUtil(JwtConfigProperties jwtConfigProperties) {
        return new JwtTokenUtil(jwtConfigProperties);
    }

}
