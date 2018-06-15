package com.springcloud.eureka.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangxia on 2018/6/14.
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello() {
        return "Hello, This is Eureka client with port:";
    }
}
