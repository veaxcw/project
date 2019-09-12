package com.chengw.common;

import com.chengw.common.config.cookie.CookieConfigProperties;
import com.chengw.common.config.cookie.TokenConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author chengw
 */
@SpringBootApplication
@EnableConfigurationProperties({
        CookieConfigProperties.class,
        TokenConfigProperties.class
})
public class CommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }

}
