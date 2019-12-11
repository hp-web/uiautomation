package com.course.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@EnableAutoConfiguration
@Controller
public class SampleContoller {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){        return "Hello World";
    }

    public static void main(String[] args){
        SpringApplication.run(SampleContoller.class,args);
    }

}
