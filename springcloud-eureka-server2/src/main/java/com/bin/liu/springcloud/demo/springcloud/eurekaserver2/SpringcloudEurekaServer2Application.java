package com.bin.liu.springcloud.demo.springcloud.eurekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer2Application.class, args);
    }

}
