package com.springcloud.feign;

import com.springcloud.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wangxia on 2018/6/20.
 */
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/helloSomeone", method = RequestMethod.GET)
    User helloSomeone(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/sayHello", method = RequestMethod.POST)
    String sayHello(@RequestBody User user);
}
