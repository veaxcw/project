package com.chengw.tiafs.config;

import com.chengw.tiafs.filter.LoginFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chengw
 */
//@Configuration
public class FilterConfig {

    @Autowired
    private LoginFilter loginFilter;

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registor = new FilterRegistrationBean<>();
        registor.setFilter(loginFilter);
        registor.addUrlPatterns("/*");
        registor.setOrder(1);
        return  registor;
    }



}
