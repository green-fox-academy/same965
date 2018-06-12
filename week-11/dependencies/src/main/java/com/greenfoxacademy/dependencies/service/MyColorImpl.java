package com.greenfoxacademy.dependencies.service;

import org.springframework.stereotype.Service;

@Service
public class MyColorImpl implements MyColor {
    public MyColorImpl() {
    }

    @Override
    public void printColor() {
        System.out.println("blue");
    }
}
