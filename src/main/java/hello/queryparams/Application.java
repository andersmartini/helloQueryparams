package hello.queryparams;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;

@OpenAPIDefinition(
        info = @Info(
                title = "Hello Queryparams API",
                version = "1.0",
                description = "Public API for Testing openApi/Swagger with Micronaut and Query Parameters"
        ),
        servers = { @Server(url = "https://example.com") },
        tags = {@Tag(name = "/hello")}
)
public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}