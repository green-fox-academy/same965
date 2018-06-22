package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tricks {
    List<String> tricks;

    public Tricks() {
        this.tricks = new ArrayList<>();
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public void addTrick(String trickName) {
        tricks.add(trickName);
    }

    public int numberOfTrick() {
        return tricks.size() + 1;
    }
}
