package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.Append;
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
    private final Append append;

    @Autowired
    public RestServiceImpl(Doubling doubling, Errors errors, Welcome welcome, Append append) {
        this.doubling = doubling;
        this.errors = errors;
        this.welcome = welcome;
        this.append = append;
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

    public Append appendA(String appendable) {
        return new Append(appendable, appendable + "a");
    }


}
