package com.springcloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangxia on 2018/6/20.
 */

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder ret = new StringBuilder();

        ret.append(helloService.hello());
        ret.append(helloService.helloSomeone("wangxia", 18).toString());
//        ret.append(helloService.sayHello(new User("Dana", 20)));

        return ret.toString();
    }



}
