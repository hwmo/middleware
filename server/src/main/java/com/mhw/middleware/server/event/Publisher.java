package com.mhw.middleware.server.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    private static final Logger log = LoggerFactory.getLogger(Publisher.class);

    @Autowired
    private ApplicationEventPublisher publisher;

    public void sendMsg(){
        LoginEvent event = new LoginEvent(this, "mhw", "20220615212100", "127.0.0.1");
        publisher.publishEvent(event);
//        System.out.println("------------------spring事件驱动模型，发送消息："+event);
        log.info("------------------spring事件驱动模型，发送消息：{}", event);
    }

}
