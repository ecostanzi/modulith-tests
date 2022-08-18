package com.example.modulithtest.modules.moduleb;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConstructorBinding
@ConfigurationProperties(prefix = "configb")
public class ConfigB {

    /**
     * The endpoint to call
     */
    String endpoint;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
