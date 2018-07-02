package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.Append;

public interface RestService {
    public Integer doubleNumber(Integer input);
    public Object doublingExercise(Integer input);
    public Object welcome(String name, String title);
    public Append appendA(String appendable);
}
