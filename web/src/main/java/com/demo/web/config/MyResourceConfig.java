package com.demo.web.config;

import com.demo.hello.api.HelloApi;
import com.demo.user.api.UserApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class MyResourceConfig extends ResourceConfig {

    public MyResourceConfig() {
        register(HelloApi.class);
        register(UserApi.class);
    }
}
