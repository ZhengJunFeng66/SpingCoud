package com.zheng.boot.bootrabbitmqamqpinput;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class BootRabbitmqAmqpInputApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootRabbitmqAmqpInputApplication.class, args);
    }

}
