package com.service;

import com.model.StaticCounter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/greatings")
public class GreatingResource {

    @GET
    public Response sayHi(){
        return Response.ok("Hi", MediaType.APPLICATION_JSON_TYPE).build();
    }

    @GET
    @Path("/{name}")
    public Response collectAndGreat(@PathParam("name")String name){
        StaticCounter thingy = new StaticCounter(name);
        return Response.ok(name + "this is  the number of objects" + StaticCounter.getNum(), MediaType.APPLICATION_JSON_TYPE).build();
    }

}
