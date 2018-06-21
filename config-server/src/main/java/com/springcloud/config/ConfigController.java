package com.springcloud.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangxia on 2018/6/21.
 */
@RestController
public class ConfigController {

    @RequestMapping("/config")
    public String config() {

        return "hello, this is a config server.";
    }
}
