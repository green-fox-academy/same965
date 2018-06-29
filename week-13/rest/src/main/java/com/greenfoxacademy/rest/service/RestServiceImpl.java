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
}
