package com.demo.config;

import com.demo.hello.api.HelloApi;
import com.demo.user.api.UserApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/demo")
public class MyResourceConfig extends ResourceConfig {

    public MyResourceConfig() {
        register(HelloApi.class);
        register(UserApi.class);
    }
}
