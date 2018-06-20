package com.springcloud.ribbonconsumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Created by wangxia on 2018/6/19.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;
    private static final String HELLO_SERVICE_HELLO = "http://HELLO-SERVICE/hello";

    @HystrixCommand(fallbackMethod = "defaultStores")
    public String hello() {
        return restTemplate.getForEntity(HELLO_SERVICE_HELLO, String.class).getBody();
    }

    public String defaultStores() {
        return "you're calling default method.";
    }
}
