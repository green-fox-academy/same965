package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public void getFoxName() {
        fox.getName();
    }

}
