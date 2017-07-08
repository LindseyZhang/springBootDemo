package com.demo.web.config;

import com.demo.hello.api.HelloApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class MyResourceConfig extends ResourceConfig {

    public MyResourceConfig() {
        register(HelloApi.class);
    }
}
