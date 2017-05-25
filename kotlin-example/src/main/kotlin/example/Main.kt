package example

import javax.ws.rs.*
import javax.ws.rs.core.*
import javax.json.*

@ApplicationPath("api")
class MyApp : Application() {

}

@Path("hello")
class HelloResource {
    @GET
    fun hello(@QueryParam("name") name:String?): JsonObject{
        return Json.createObjectBuilder()
                .add("msg", "Hello Kotlin " + name)
                .build()
    }
}