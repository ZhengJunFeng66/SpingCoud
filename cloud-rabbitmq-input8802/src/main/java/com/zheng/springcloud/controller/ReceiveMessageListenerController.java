package com.zheng.springcloud.controller;

import javafx.geometry.VPos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {
    @Value("${server.port}")
    String port;
    @StreamListener(Sink.INPUT)
    public void input(Message<String> stringMessage){
        System.out.println("消费者------------>"+stringMessage.getPayload()+"\t"+port);

    }
}
