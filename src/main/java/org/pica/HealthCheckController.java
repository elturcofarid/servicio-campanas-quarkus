package org.pica;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.*;


@Path("/info")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HealthCheckController {

    final Map<String, String> status = new HashMap<>();

    @GET
    @Path("/health")
    public Response health() {
        status.put("STATUS", "UP");
//        return Response.ok(Map.of("STATUS", "UP")).build();
        return Response.ok(status).build();
    }

    @GET
    @Path("/status")
    public Response status() {
       // return Response.ok(Map.of()).build();
        return Response.ok(status).build();
    }

}
