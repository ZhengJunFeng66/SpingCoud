package com.zheng.payment8003;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.zheng.payment8003.dao")
@EnableEurekaClient
public class CloudProviderPayment8003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8003Application.class, args);
    }

}
