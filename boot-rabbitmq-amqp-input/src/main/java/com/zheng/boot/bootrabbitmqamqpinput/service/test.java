package com.zheng.boot.bootrabbitmqamqpinput.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class test {
    @RabbitListener(queues ={"queueOne","queueTwo","queueThree"} )
    public void tst(String mag){
        System.out.println(mag+"tst");
    }

    @RabbitListener(queues = "queueTwo")
    public void queueTwo(String mag){
        System.out.println(mag+"queueTwo");
    }

    @RabbitListener(queues = "queueThree")
    public void queueThree(String mag){
        System.out.println(mag+"queueThree");
    }
//
//    @RabbitListener(queues = "queueFour")
//    public void queueFour(String mag){
//        System.out.println(mag);
//    }
}
