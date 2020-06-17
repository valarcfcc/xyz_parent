package com.xyz.test;

import com.xyz.mq.MqApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: valarcfcc
 * @Date: 2020/5/28 22:08
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MqApplication.class)
public class ProductTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void sendMsg(){
        rabbitTemplate.convertAndSend("xyz","test1");
    }
}
