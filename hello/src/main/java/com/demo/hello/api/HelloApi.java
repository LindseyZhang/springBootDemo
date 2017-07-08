package com.demo.hello.api;

import com.demo.hello.api.dto.HelloDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @GetMapping("/hello")
    public HelloDTO hello() {
        return new HelloDTO("welcome", "lin");
    }
}