package com.zheng.springboot.bootrabbitmqamqp.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @GetMapping("/get")
    public void get(){
        System.out.println("→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→");
       rabbitTemplate.convertAndSend("topic","","测试++++++");
       rabbitTemplate.convertAndSend("topic","hello", "测试----");
        rabbitTemplate.convertAndSend("hello", "测试*****");
        rabbitTemplate.convertAndSend("topic","测试&&&&&&&&&&&&&&&&&&&&&&77");
        System.out.println("😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭");
    }
    @GetMapping("/get2")
    public void get2(){
        System.out.println("→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→");
        rabbitTemplate.convertAndSend("direct","","测试++++++");
        rabbitTemplate.convertAndSend("direct","hello2", "测试----");
        rabbitTemplate.convertAndSend("hello2", "测试*****");
        rabbitTemplate.convertAndSend("direct","测试&&&&&&&&&&&&&&&&&&&&&&77");
        System.out.println("😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭");
    }
    @GetMapping("/get3")
    public void get3(){
        System.out.println("→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→");
        rabbitTemplate.convertAndSend("fanout","","测试++++++");
        rabbitTemplate.convertAndSend("fanout","测试&&&&&&&&&&&&&&&&&&&&&&77");
        System.out.println("😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭😭");
    }
}
