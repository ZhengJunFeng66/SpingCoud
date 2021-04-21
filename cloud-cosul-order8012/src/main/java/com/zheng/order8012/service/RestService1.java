package com.zheng.order8012.service;

import com.zheng.order8012.service.Impi.RestService1ImpI;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "cloud-provider-feign-hystrix-pament",fallback = RestService1ImpI.class)
public interface RestService1 {
    @RequestMapping("/ddds")
    public String info_ok();
    @RequestMapping("/aaas")
    public String info_time();
}
