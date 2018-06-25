package com.springcloud.sample.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by wangxia on 2018/6/25.
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceConfiguration {

    private String url;

    private String user;

    private String password;


}
