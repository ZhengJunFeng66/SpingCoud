package com.zheng.feignhystrixpament8006;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableHystrix
public class CloudProviderFeignHystrixPament8006Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderFeignHystrixPament8006Application.class, args);
    }

}
