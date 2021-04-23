package com.zheng.springcloud.service.serviceIpmI;

import com.zheng.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)
public class IMessageProviderImpI implements IMessageProvider {
    @Resource
    private MessageChannel output;
    @Override
    public String send() {
        String uid= UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uid).build());
        System.out.println(uid);
        return null;
    }
}
