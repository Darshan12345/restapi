package webservice.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorld {

    @GetMapping(value = "/")
    public String helloWorld()
    {
        return "Hello! Darshan Makwana";
    }

    @GetMapping(path = "/hello-world")
    protected helloWorldBean returnBean(){


        return new helloWorldBean("Hello Darshan Makwana");
    }


    @GetMapping(path = "hello-world/pathvariable/{name}")
    public helloWorldBean pathvariable(@PathVariable String name)
    {
        return new helloWorldBean(name);
    }
}
