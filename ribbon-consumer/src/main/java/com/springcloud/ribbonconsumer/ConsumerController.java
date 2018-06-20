package com.springcloud.ribbonconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangxia on 2018/6/15.
 */

@RestController
public class ConsumerController {


    @Autowired
    public HelloService helloService;


    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }
}

