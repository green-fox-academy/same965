package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestServiceImpl implements RestService {

    private final Doubling doubling;
    private final Errors errors;
    private final Welcome welcome;
    private final Append append;
    private final Until until;
    private final DoUntil result;
    private final ArrayHandler arrayHandler;

    @Autowired
    public RestServiceImpl(Doubling doubling, Errors errors, Welcome welcome, Append append, Until until, DoUntil result, ArrayHandler arrayHandler) {
        this.doubling = doubling;
        this.errors = errors;
        this.welcome = welcome;
        this.append = append;
        this.until = until;
        this.result = result;
        this.arrayHandler = arrayHandler;
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

    private Integer sum(Integer number) {
        Integer sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    private Integer factor(Integer number) {
        Integer factor = 1;
        for (int i = 1; i <= number; i++) {
            factor *= i;
        }
        return factor;
    }

    public Object doUntil(String what, Until until) {
        if (until == null) {
            return new Errors("Please provide a number!");
        } else if (what == null) {
            return new Errors("Please tell what to do!");
        } else if (what.equals("sum")) {
            result.setResult(sum(until.getUntil()));
        } else if (what.equals("factor")) {
            result.setResult(factor(until.getUntil()));
        }
        return result;
    }

    private Integer sumNumbers(Integer[] numbers) {
        Integer sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private Integer multiply(Integer[] numbers) {
        Integer multiply = 1;
        for (int i = 0; i < numbers.length; i++) {
            multiply *= numbers[i];
        }
        return multiply;
    }

    private Integer[] doubleNumbers(Integer[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }

    public Object arrayHandler(ArrayHandler arrayHandler) {
        if (arrayHandler.getWhat() == null || arrayHandler.getNumbers() == null || arrayHandler == null) {
            return new Errors("Please provide what to do with the numbers!");
        } else if (arrayHandler.getWhat().equals("sum")) {
            return sumNumbers(arrayHandler.getNumbers());
        } else if (arrayHandler.getWhat().equals("multiply")) {
            return multiply(arrayHandler.getNumbers());
        } else if (arrayHandler.getWhat().equals("double")) {
            return doubleNumbers(arrayHandler.getNumbers());
        }
        return new Errors("Please provide what to do with the numbers!");
    }
}
