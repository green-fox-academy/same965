package com.greenfoxacademy.rest.controller;


import com.greenfoxacademy.rest.service.RestService;
import org.springframework.web.bind.annotation.GetMapping;
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
        if (input != null) {
            return restService.doubleNumber(input);
        }
        return restService.errorMessage();
    }
}
