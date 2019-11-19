package com.example.demo.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ActiveMqClient {

    @Autowired
    private JmsTemplate jmsTemplate;

    @RequestMapping("/send/topic")
    public void send(){
        jmsTemplate.convertAndSend("topic","hello-topic");
    }
    @RequestMapping("/send/topic1")
    public void sendTopic(){
        jmsTemplate.convertAndSend("topic1","hello-topic1");
    }
    @RequestMapping("/send/queue")
    public void sendQueue(){
        jmsTemplate.convertAndSend("queue","hello-queue");
    }
}
