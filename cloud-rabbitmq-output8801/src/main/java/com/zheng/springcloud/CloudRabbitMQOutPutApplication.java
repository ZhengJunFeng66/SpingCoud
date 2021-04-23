package com.zheng.springcloud;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudRabbitMQOutPutApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudRabbitMQOutPutApplication.class,args);
    }
}
