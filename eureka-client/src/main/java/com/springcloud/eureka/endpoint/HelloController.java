package com.springcloud.eureka.endpoint;

import com.sun.istack.internal.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

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
}
