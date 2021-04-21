package com.zheng.payment8012;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.zheng.payment8012.dao")
@EnableDiscoveryClient

public class CloudConsulPayment8004Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsulPayment8004Application.class, args);
    }

}
