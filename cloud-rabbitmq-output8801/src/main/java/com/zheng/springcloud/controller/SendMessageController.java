package com.zheng.springcloud.controller;

import com.zheng.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {
    @Resource
    IMessageProvider iMessageProvider;
    @GetMapping("/ddd")
    public String send(){
        return iMessageProvider.send();
    }
}
