package com.zheng.feignhystrixpament8006.controller;

import com.zheng.feignhystrixpament8006.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProviderController {
    @Autowired
    ProviderService providerService;

    @RequestMapping("/ddds")
    public String info_ok(){
        return providerService.info_ok();
    }
    @RequestMapping("/aaas")
    public String info_time(){
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return providerService.info_time();
    }
}
