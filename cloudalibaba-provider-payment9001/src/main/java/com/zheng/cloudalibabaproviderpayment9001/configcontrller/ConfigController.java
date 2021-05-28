package com.zheng.cloudalibabaproviderpayment9001.configcontrller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Slf4j
public class ConfigController {
    @Value("${zheng.jun}")
    String value;
    @GetMapping("/get")
    @SentinelResource(value = "get",fallback = "erro",blockHandler = "erro")
    public String gets(){

        return value ;
    }
    public String erro(){
        return "这是个错误";
    }
}
