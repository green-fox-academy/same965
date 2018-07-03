package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.Append;
import com.greenfoxacademy.rest.model.Until;

public interface RestService {
    public Integer doubleNumber(Integer input);
    public Object doublingExercise(Integer input);
    public Object welcome(String name, String title);
    public Append appendA(String appendable);
    public Object doUntil(String what, Until until);
}
