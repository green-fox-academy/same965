package com.greenfoxacademy.foxclub.models;

import org.springframework.stereotype.Component;

@Component
public class Fox {
    private String  name;
    private Food food;
    private Drink drink;
    private Tricks tricks;

    public Fox() {
    }

    public Fox(String name, Food food, Drink drink, Tricks tricks) {
        this.name = name;
        this.food = new Food();
        this.drink = new Drink();
        this.tricks = new Tricks();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Tricks getTricks() {
        return tricks;
    }

    public void setTricks(Tricks tricks) {
        this.tricks = tricks;
    }
}
