package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {
    private Fox fox;

    public FoxServiceImpl() {
        this.fox = new Fox();
    }

    public void setFoxName(String name) {
        fox.setName(name);
    }

    public String getFoxName() {
        return fox.getName();
    }

    public int numberOfTricks() {
        if (fox.getTricks() == null) {
            return 0;
        }
        return fox.getTricks().size();
    }

    public void setFoxFood(String food) {
        fox.setFood(food);
    }

    public void setFoxDrink(String drink) {
        fox.setDrink(drink);
    }

    public String getFoxFood() {
        if (fox.getFood() == null) {
            return "salad";
        }
        return fox.getFood();
    }

    public String getFoxDrink() {
        if (fox.getDrink() == null) {
            return "water";
        }
        return fox.getDrink();
    }

    public void addFoxTrick(String trick) {
        fox.getTricks().add(trick);
    }

    public List<String> getFoxTricks() {
        return fox.getTricks();
    }
}
