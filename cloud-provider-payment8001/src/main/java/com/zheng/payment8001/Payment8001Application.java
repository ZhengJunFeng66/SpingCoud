package com.zheng.payment8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@MapperScan("com.zheng.payment8001.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment8001Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Payment8001Application.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for(String str:beanDefinitionNames){
            System.out.println(str);
        }
    }

}
