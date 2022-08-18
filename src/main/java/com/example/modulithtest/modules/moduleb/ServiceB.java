package com.example.modulithtest.modules.moduleb;

import com.example.modulithtest.modules.modulea.ServiceA;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {

    private final ServiceA serviceA;

    private final ApplicationEventPublisher applicationEventPublisher;

    public ServiceB(ServiceA serviceA, ApplicationEventPublisher applicationEventPublisher) {
        this.serviceA = serviceA;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void doSomething() {
        applicationEventPublisher.publishEvent(new MyEvent());
    }
}
