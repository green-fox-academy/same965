package com.greenfoxacademy.rest.controller;


import com.greenfoxacademy.rest.service.RestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {
    private final RestService restService;

    public ExerciseController(RestService restService) {
        this.restService = restService;
    }

    @GetMapping("doubling")
    public Object doublingInput(@RequestParam(value = "input", required = false) Integer input) {
        return restService.doublingExercise(input);
    }

    @GetMapping("greeter")
    public Object greeter(@RequestParam(value = "name", required = false) String name,
                          @RequestParam(value = "title", required = false) String title) {
        return restService.welcome(name, title);
    }

    @GetMapping("appenda/{appendable}")
    public Object appenda(@PathVariable(value = "appendable") String appendable) {
        return restService.appendA(appendable);
    }
}
