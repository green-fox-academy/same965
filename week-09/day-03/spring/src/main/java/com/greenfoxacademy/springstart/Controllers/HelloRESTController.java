package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
    Greeting greeting = new Greeting();

    @RequestMapping(value = "/greeting")
    public Greeting greet(@RequestParam("name") String name) {
        greeting.setContent("Hello " + name);
        greeting.counter();
        return greeting;
    }
}
