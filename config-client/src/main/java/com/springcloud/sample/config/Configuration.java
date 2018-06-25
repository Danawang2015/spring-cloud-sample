package com.springcloud.sample.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.sql.DataSourceDefinition;

/**
 * Created by wangxia on 2018/6/25.
 */

@Component
@ConfigurationProperties(prefix = "home")
public class Configuration {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
