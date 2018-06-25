package com.springcloud.sample.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by wangxia on 2018/6/25.
 */
@SpringBootApplication(scanBasePackages = "com.springcloud.sample.config")
public class ConfigClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }
}
