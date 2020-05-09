package org.pica;


import com.google.inject.Inject;
import io.quarkus.eureka.client.EurekaClient;
import io.quarkus.eureka.client.loadBalancer.LoadBalanced;
import io.quarkus.eureka.client.loadBalancer.LoadBalancerType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class CampanaController {

    @Inject
    //@LoadBalanced(type = LoadBalancerType.ROUND_ROBIN)
    public io.quarkus.eureka.client.EurekaClient eurekaClient;


    @ConfigProperty(name = "texto", defaultValue="hello default")
        String message;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    System.out.println("Mensaje: " + message);
        return "hello";
    }
}