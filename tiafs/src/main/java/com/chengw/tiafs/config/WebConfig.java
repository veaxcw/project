package com.chengw.tiafs.config;


import com.chengw.tiafs.interceptor.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author chengw
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    public  void addResourceHandlers(ResourceHandlerRegistry registry) {


        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");

        super.addResourceHandlers(registry);
    }

    @Autowired
    private AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        /**
         *addPathPatterns 用于添加拦截器规则
         * excludePathPatterns 排除拦截器规则
         * ***/

        registry.addInterceptor(authInterceptor).addPathPatterns("/**").excludePathPatterns("/sec","/api/login","/api/signin","/signin.html",
                "/Styles/**","/Scripts/**","/api/checkCode","/favicon.ico","/images/**","/img/**","/public/**","/error");
        super.addInterceptors(registry);
    }

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/signin").setViewName("signin");
        super.addViewControllers(registry);
    }
}
