package com.example.modulithtest.modules.modulea;

import com.example.modulithtest.modules.moduleb.MyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {

    @EventListener
    public void handleEvent(MyEvent somethingHappenedEvent) {

    }
}
