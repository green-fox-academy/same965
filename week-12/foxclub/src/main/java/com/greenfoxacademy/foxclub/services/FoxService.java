package com.greenfoxacademy.foxclub.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoxService {
    public void setFoxName(String name);
    public String getFoxName();
    public int numberOfTricks();
    public void setFoxFood(String food);
    public void setFoxDrink(String drink);
    public String getFoxFood();
    public String getFoxDrink();
    public void addFoxTrick(String trick);
    public List<String> getFoxTricks();
}
