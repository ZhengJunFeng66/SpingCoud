package com.zheng.order8012;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
class CloudZookeeperOrder8012Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZookeeperOrder8012Application.class, args);
    }

}
