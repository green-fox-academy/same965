package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value = "/greeting")
    public Greeting greet() {
        return new Greeting(1, "Hello");
    }
}
