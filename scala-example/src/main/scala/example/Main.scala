
package exmaple

import javax.json.JsonObject
import javax.json.Json
import javax.ws.rs._
import javax.ws.rs.core._

@ApplicationPath("api")
class MyApp extends Application

@Path("hello")
class HelloResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  def hello(@QueryParam("name") name: String): JsonObject = {
    return Json.createObjectBuilder()
      .add("msg", "Hello Scala " + name)
      .build()
  }
}
