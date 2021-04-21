package com.zheng.configcemter3344;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class CloudConfigCemter3344Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCemter3344Application.class, args);
    }

}
