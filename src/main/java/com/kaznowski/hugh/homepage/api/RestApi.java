package com.kaznowski.hugh.homepage.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by hugh on 31/01/16.
 */
@Path("/api")
public class RestApi {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String ping() {
        return "{\"key\": \"Works\"}";
    }

}
