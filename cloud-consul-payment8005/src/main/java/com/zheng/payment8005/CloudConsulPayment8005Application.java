package com.zheng.payment8005;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.zheng.payment8005.dao")
@EnableDiscoveryClient
public class CloudConsulPayment8005Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsulPayment8005Application.class, args);
    }

}
