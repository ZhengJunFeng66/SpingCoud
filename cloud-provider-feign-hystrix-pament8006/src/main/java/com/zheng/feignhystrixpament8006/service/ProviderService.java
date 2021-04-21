package com.zheng.feignhystrixpament8006.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import org.springframework.stereotype.Service;

import javax.net.ssl.SSLServerSocket;

@Service
public class ProviderService {


    public String info_ok(){
        return "线程池:"+Thread.currentThread().getName()+"<**info_ok**>"+"O(∩_∩)O";
    }

    @HystrixCommand(fallbackMethod = "dom",commandProperties = {
            @HystrixProperty(name = HystrixPropertiesManager.EXECUTION_ISOLATION_THREAD_TIMEOUT_IN_MILLISECONDS,value = "3000")
    })
    public String info_time(){

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:"+Thread.currentThread().getName()+"<**info_time**>"+"/(ㄒoㄒ)/~~";
    }
    public String dom(){
        return "服务繁忙";
    }
}
