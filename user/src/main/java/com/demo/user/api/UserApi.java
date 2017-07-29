package com.demo.user.api;

import com.demo.response.SimpleResponseWarpper;
import com.demo.user.api.command.AuthenticationCommand;
import com.demo.user.api.command.CreateUserCommand;
import com.demo.user.api.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.ok;

@Path("/user")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class UserApi {
    private UserFacade userFacade;

    @Autowired
    public UserApi(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @GET
    @Path("/{id}")
    public Response user(@PathParam("id") Long id) {
        return ok(userFacade.get(id)).build();
    }

    @POST
    @Path("/login")
    public Response login(@Valid AuthenticationCommand authCommand) {
        return ok(userFacade.login(authCommand)).build();
    }

    @POST
    public Response addUser(CreateUserCommand createUserCommand) {
        Long id = userFacade.addUser(createUserCommand);
        return ok(new SimpleResponseWarpper("id", String.valueOf(id))).build();
    }
}
