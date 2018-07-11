package com.greenfoxacademy.rest.controller;


import com.greenfoxacademy.rest.model.*;
import com.greenfoxacademy.rest.service.RestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExerciseController {
    private final RestService restService;

    public ExerciseController(RestService restService) {
        this.restService = restService;
    }

    @GetMapping(value = "doubling")
    public ResponseEntity<DoublingResponse> doublingInput(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            DoublingResponse doubling = restService.doublingResponse(input);
            return new ResponseEntity<>(doubling, HttpStatus.OK);
        }
        DoublingResponse error = restService.doublingError();
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
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

    @PostMapping("dountil/{what}")
    public Object dountil(@PathVariable(value = "what") String what,
                          @RequestBody(required = false) Until until) {
        return restService.doUntil(what, until);
    }

    @PostMapping("arrays")
    public Object arrays(@RequestBody(required = false) ArrayHandler arrayHandler) {
        return restService.arrayHandler(arrayHandler);
    }
}
