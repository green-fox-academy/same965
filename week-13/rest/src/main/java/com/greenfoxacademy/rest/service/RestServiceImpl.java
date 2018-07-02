package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.Doubling;
import com.greenfoxacademy.rest.model.Errors;
import com.greenfoxacademy.rest.model.Welcome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestServiceImpl implements RestService {

    private final Doubling doubling;
    private final Errors errors;
    private final Welcome welcome;

    @Autowired
    public RestServiceImpl(Doubling doubling, Errors errors, Welcome welcome) {
        this.doubling = doubling;
        this.errors = errors;
        this.welcome = welcome;
    }

    public Integer doubleNumber(Integer input) {
        return input * 2;
    }

    public Object doublingExercise(Integer input) {
        if (input != null) {
            return new Doubling(input, doubleNumber(input));
        }
        return new Errors("Please provide an input!");
    }

    public Object welcome(String name, String title) {
        if (name == null) {
            return new Errors("Please provide a name!");
        } else if (title == null) {
            return new Errors("Please provide a title!");
        }
        return new Welcome("Oh, hi there " + name + ", my dear " + title + "!");
    }
}
