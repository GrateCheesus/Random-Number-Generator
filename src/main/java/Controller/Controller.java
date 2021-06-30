package Controller;

import java.util.Random;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class Controller {

    private static int counter = 0;

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String SampleMethod(){
        Random rand = new Random();

        int int_random = rand.nextInt(101);

        return "Your random Number is: " + int_random;
    }}
