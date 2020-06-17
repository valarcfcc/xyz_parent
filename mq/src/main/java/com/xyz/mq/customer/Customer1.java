package com.xyz.mq.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: valarcfcc
 * @Date: 2020/5/28 22:13
 * @Description:
 */
@Component
@RabbitListener(queues = "xyz")
public class Customer1 {

    @RabbitHandler
    public void showMsg(String message) {
        System.out.printf("xyz消息： " + message );

    }
}
