package com.greenfoxacademy.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestServiceImpl implements RestService {
    
    public Integer doubleNumber(Integer input) {
        return input * 2;
    }

    public String errorMessage() {
        return "Error: Please provide an input!";
    }

    public Object doublingExercise(Integer input) {
        if (input != null) {
            return doubleNumber(input);
        }
        return errorMessage();
    }

    public String welcome(String name, String title) {
        if (name == null) {
            return "Error: Please provide a name!";
        } else if (title == null) {
            return "Error: Please provide a title!";
        }
        return "Welcome_message: Oh hi there " + name + ", my dear " + title + "!";
    }
}
