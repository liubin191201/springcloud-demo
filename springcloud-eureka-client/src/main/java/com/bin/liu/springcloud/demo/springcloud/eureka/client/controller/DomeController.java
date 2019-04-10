package com.bin.liu.springcloud.demo.springcloud.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-demo
 * @description:
 * @author: bin.liu
 * @create: 2019-04-11 07:15
 **/

@RestController
public class DomeController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "spring-cloud-eureka-client";
    }
}

