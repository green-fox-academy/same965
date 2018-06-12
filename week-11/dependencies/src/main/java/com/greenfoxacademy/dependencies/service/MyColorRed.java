package com.greenfoxacademy.dependencies.service;

import org.springframework.stereotype.Service;

@Service
public class MyColorRed implements MyColor {
    public MyColorRed() {
    }

    @Override
    public void printColor() {
        System.out.println("red");
    }
}
