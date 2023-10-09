package eu.krylov.jersey.examples.appath_example;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

@ApplicationPath("/api")
@OpenAPIDefinition(
    info = @Info(
        title = "My API",
        version = "0.1",
        description = "Here is a very long API description in Markdown format.",
        termsOfService = "http://swagger.io/terms/",
        contact = @Contact(email = "apiteam@swagger.io"),
        license = @License(
            name = "Apache 2.0",
            url = "http://www.apache.org/licenses/LICENSE-2.0.html"
        )
    ),
    servers = { @Server(url = "/appath-example/") }
)
public class MyApplication extends Application {
}
