package com.myspringcloud.server_registe_center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerRegisteCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerRegisteCenterApplication.class, args);
    }

}
