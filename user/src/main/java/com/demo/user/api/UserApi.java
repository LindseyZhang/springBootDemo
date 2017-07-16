package com.demo.user.api;

import com.demo.user.api.command.CreateUserCommand;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/user")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class UserApi {
    @POST
    public String addUser(CreateUserCommand createUserCommand) {
        return "add user successfully";
    }
}
