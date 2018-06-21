package com.springcloud.eureka.endpoint;

import com.sun.istack.internal.logging.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import com.springcloud.bean.*;

/**
 * Created by wangxia on 2018/6/14.
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(HelloController.class);


    @RequestMapping("/hello")
    public String hello() throws Exception {
        int sleepTime = new Random().nextInt(3000);

        logger.info("spend time is " + sleepTime);
        Thread.sleep(sleepTime);

        return "Hello, This is Eureka client with port:";
    }

    @RequestMapping(value = "/helloSomeone", method = RequestMethod.GET)
    public User helloSomeone(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);

    }

    @RequestMapping(value = "/sayHello", method = RequestMethod.POST)
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}
