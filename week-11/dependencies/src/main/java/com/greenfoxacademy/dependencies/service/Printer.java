package com.greenfoxacademy.dependencies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {
    private final MyColor myColor;

    @Autowired
    public Printer(@Qualifier("myColorRed") MyColor myColor) {
        this.myColor = myColor;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " hohaho " + message);
    }
}
