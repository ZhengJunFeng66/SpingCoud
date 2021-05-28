package com.zheng.springboot.bootrabbitmqamqp.rabbitmqConfig;

import org.springframework.amqp.core.*;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class RabbitmqConfig {
    //queue 队列
    @Bean
    Queue queueOne(){
        return new Queue("queueOne",true);
    }
    @Bean
    Queue queueTwo(){
        return new Queue("queueTwo",true);
    }
    @Bean
    Queue queueThree (){
        return new Queue("queueThree",true);
    }
    @Bean
    Queue queueFour(){
        return new Queue("queueFour",true);
    }

    //将交换机
    @Bean
    TopicExchange TopicExchange (){
        return new TopicExchange("topic", true, false);
    }

    @Bean
    DirectExchange directExchange(){
        return  new DirectExchange("direct",true,false);
    }

    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanout",true,false);
    }

    //绑定器
    @Bean
    Binding binding(){
        return BindingBuilder.bind(queueOne()).to(TopicExchange()).with("hello");
    }

    @Bean
    Binding bindingTwo(){
        return BindingBuilder.bind(queueTwo()).to(directExchange()).with("hello2");
    }

    @Bean
    Binding bindingThree(){
        return BindingBuilder.bind(queueThree()).to(fanoutExchange());
    }
//    @Bean
//    Binding binding1(){
//        return BindingBuilder.bind(queueTwo()).to(TopicExchange()).with("hello2");
//    }
//    @Bean
//    Binding binding2(){
//        return BindingBuilder.bind(queueThree()).to(TopicExchange()).with("hello3");
//    }
//    @Bean
//    Binding binding3(){
//        return BindingBuilder.bind(queueFour()).to(TopicExchange()).with("hello4");
//    }


}
