package com.springcloud.sample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangxia on 2018/6/25.
 */

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @Value("${datasource.driver-class-name}")
    String dataSourceDriverClass;


    @Value("${datasource.url}")
    String dataSourceURL;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {

//        return "welcome to home";
        return homeService.getInfo();

    }

    @RequestMapping(value = "/db", method = RequestMethod.GET)
    public String dbinfo() {
        return dataSourceURL + dataSourceDriverClass;
    }
}
