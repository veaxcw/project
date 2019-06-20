package com.chengw.registry;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chengw
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudRegistryApplication.class, args);
    }

}
