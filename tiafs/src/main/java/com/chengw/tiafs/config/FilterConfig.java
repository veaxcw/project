package com.chengw.tiafs.config;

import com.chengw.tiafs.filter.LoginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean loginFilter = new FilterRegistrationBean<>();
        loginFilter.setFilter(loginFilter());
        loginFilter.addUrlPatterns("/*");
        loginFilter.setOrder(1);
        return  loginFilter;
    }

    private LoginFilter loginFilter(){
        return new LoginFilter();
    }

}
