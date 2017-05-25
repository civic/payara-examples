package example;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by tsasaki on 17/05/25.
 */
@Path("hello")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject hello(@QueryParam("name") String name){
        return Json.createObjectBuilder()
                .add("msg", "Hello World JAX-RS " + name)
                .build();
    }
}
