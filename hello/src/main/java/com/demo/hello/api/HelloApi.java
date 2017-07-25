package com.demo.hello.api;

import com.demo.hello.api.dto.HelloDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/hello")
@Produces(APPLICATION_JSON)
public class HelloApi {

    @GET
    public HelloDTO hello() {
        return new HelloDTO("welcome", "lin");
    }
}
