package com.zheng.springcloud;


//import com.zheng.ribbon.Ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
//@LoadBalancerClients({@LoadBalancerClient(value = "CLOUD-PROVIDER-PAYMENT",configuration = CustomLoadBalancerConfiguration.class)})
//@RibbonClient(name = "cloud-provider-payment",configuration = Ribbon.class)
public class CloudProviderOrder8002Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderOrder8002Application.class, args);
    }
}
