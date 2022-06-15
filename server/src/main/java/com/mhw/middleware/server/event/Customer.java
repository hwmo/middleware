package com.mhw.middleware.server.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class Customer implements ApplicationListener<LoginEvent> {

    private static final Logger log = LoggerFactory.getLogger(Customer.class);

    @Override
    @Async
    public void onApplicationEvent(LoginEvent loginEvent) {
//        System.out.println("------------------spring事件驱动模型，接收消息："+loginEvent);
        log.info("------------------spring事件驱动模型，接收消息：{}", loginEvent);
    }
}
