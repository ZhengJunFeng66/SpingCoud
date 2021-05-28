package com.zheng.cloudalibabaproviderpayment9001;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoDataSourceProxy
public class CloudalibabaProviderPayment9001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9001Application.class, args);
    }

}
