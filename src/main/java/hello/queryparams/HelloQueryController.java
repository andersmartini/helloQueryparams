package hello.queryparams;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.annotation.Nullable;

@Tag(name = "/hello")
@Controller("/")
public class HelloQueryController {

    @Produces(MediaType.TEXT_PLAIN)
    @Get("/hello{?foo,bar}")
    public String query(@Nullable String foo, @Nullable String bar) {
        return foo + bar;
    }
}
