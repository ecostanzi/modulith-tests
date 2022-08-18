package com.example.modulithtest.modules.modulec;

import com.example.modulithtest.modules.moduleb.ServiceB;
import org.springframework.stereotype.Component;

@Component
public class ServiceC {

    private final ServiceB serviceB;

    public ServiceC(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
