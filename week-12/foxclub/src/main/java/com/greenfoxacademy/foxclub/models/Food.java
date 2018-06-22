package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Food {
    List<String> food;

    public Food() {
        this.food = new ArrayList<>();
    }

    public List<String> getFood() {
        return food;
    }

    public void addFood(String foodName) {
        food.add(foodName);
    }
}
