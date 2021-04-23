package com.zheng.springcloud.contriller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@EnableBinding(Sink.class)
public class SickMessgeListenerContorller {
    @Value("${server.port}")
    String port;
    @StreamListener(Sink.INPUT)
    public void input(Message<String> stringMessage){
        System.out.println(stringMessage.getPayload().toString());
    }
}
