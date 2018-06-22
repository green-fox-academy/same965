package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drink {
    List<String> drink;

    public Drink() {
        this.drink = new ArrayList<>();
    }

    public List<String> getDrink() {
        return drink;
    }

    public void addDrink(String drinkName) {
        drink.add(drinkName);
    }
}
