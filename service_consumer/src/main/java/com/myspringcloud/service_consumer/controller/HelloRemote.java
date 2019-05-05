package com.myspringcloud.service_consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: huangsj
 * @Date: 2019/4/30 17:14
 * @Description:
 */
@FeignClient(name = "eureka-producer",fallback = SchedualServiceHiHystric.class)
public interface HelloRemote {

    @GetMapping("/hello/")
    String hello();

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
