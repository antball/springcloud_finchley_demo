package com.myspringcloud.service_consumer.controller;

import org.springframework.stereotype.Component;

/**
 * @Auther: huangsj
 * @Date: 2019/5/5 10:41
 * @Description:
 */
@Component
public class SchedualServiceHiHystric implements HelloRemote {
    @Override
    public String hello() {
        return "hello test Hystric";
    }

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}