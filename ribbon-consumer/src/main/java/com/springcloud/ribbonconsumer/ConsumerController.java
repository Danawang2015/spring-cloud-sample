package com.springcloud.ribbonconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wangxia on 2018/6/15.
 */

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;
    private static final String HELLO_SERVICE_HELLO = "http://HELLO-SERVICE/hello";


    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return restTemplate.getForEntity(HELLO_SERVICE_HELLO, String.class).getBody();
    }
}

