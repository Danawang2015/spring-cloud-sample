package com.springcloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wangxia on 2018/6/14.
 */
//@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.springcloud.eureka.endpoint")
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
