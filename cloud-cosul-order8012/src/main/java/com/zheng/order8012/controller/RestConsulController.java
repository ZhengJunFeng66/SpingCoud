package com.zheng.order8012.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import com.zheng.commons.bean.StudentBean;
import com.zheng.commons.bean.TestBean;
import com.zheng.order8012.api.RestCosulApi;
import com.zheng.order8012.service.RestService;
import com.zheng.order8012.service.RestService1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
public class RestConsulController implements RestCosulApi {
    @Autowired
    RestService restService;
    @Autowired
    RestService1 restService1;

    public List<StudentBean> studentBeans() {
        log.info("***************************");
        List<StudentBean> studentBeans = restService.studentBeans();
        return studentBeans;
    }
    @Override
    public TestBean testBean() {
        return null;
    }

    @HystrixCommand(fallbackMethod = "test",commandProperties = {
            @HystrixProperty(name=HystrixPropertiesManager.EXECUTION_ISOLATION_THREAD_TIMEOUT_IN_MILLISECONDS,value = "4000"),
            @HystrixProperty(name = HystrixPropertiesManager.CIRCUIT_BREAKER_ENABLED,value = "true")
    })
    @GetMapping("/zzzs")
    public String info_ok(){
        return restService1.info_ok();
    }
    @HystrixCommand(fallbackMethod = "test",commandProperties = {
            @HystrixProperty(name= HystrixPropertiesManager.EXECUTION_ISOLATION_THREAD_TIMEOUT_IN_MILLISECONDS,value = "4000"),
            @HystrixProperty(name = HystrixPropertiesManager.CIRCUIT_BREAKER_ENABLED,value = "true")
    })
    @GetMapping("/xxxs")
    public String info_time(){
        return restService1.info_time();
    }
    public String test(){
        return "错误";
    }
}
