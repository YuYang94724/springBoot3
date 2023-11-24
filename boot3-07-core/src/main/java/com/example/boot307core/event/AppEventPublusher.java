package com.example.boot307core.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

//主要用來發送該做哪些事情的事件傳送
@Service
public class AppEventPublusher implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void sendEvent(ApplicationEvent applicationEvent) {
        applicationEventPublisher.publishEvent(applicationEvent);
    }
}
