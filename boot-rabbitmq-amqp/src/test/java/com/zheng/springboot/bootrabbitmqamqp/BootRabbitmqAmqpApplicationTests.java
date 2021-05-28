package com.zheng.springboot.bootrabbitmqamqp;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootRabbitmqAmqpApplicationTests {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    void contextLoads() {

        rabbitTemplate.convertAndSend("hello", "ceishi");
    }

}
