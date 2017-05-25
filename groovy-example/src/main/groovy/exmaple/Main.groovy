package example

import javax.json.Json
import javax.json.JsonObject
import javax.ws.rs.*
import javax.ws.rs.core.*

@ApplicationPath("api")
class MyApp extends Application{

}

@Path("hello")
class HelloResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    def JsonObject hello(@QueryParam("name") String name){
        return Json.createObjectBuilder()
            .add("msg", "Hello Groovy " + name)
            .build()
    }
}