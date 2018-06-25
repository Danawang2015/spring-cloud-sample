package com.springcloud.sample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by wangxia on 2018/6/25.
 */
@Component
public class HomeService {

    @Autowired
    Configuration config;

    public String getInfo() {

        return config.getTitle();
    }


}
