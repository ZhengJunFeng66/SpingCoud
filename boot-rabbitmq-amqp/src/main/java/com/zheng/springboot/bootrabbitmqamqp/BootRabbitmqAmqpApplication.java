package com.zheng.springboot.bootrabbitmqamqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class BootRabbitmqAmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootRabbitmqAmqpApplication.class, args);
    }

}
