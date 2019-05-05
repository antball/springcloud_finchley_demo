package com.myspringcloud.service_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: huangsj
 * @Date: 2019/4/30 17:15
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/hello")
    public String index() {
        return helloRemote.hello();
    }

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return helloRemote.sayHiFromClientOne( name );
    }


}