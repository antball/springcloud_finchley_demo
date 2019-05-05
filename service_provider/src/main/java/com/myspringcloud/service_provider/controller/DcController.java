package com.myspringcloud.service_provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Auther: huangsj
 * @Date: 2019/4/30 09:01
 * @Description:
 */
@RestController
public class DcController {

    @Value("${server.port}")
    String port;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }


    @GetMapping("/hello")
    public String hello() {
        return "Hello, " + new Date();


    }

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "china") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}