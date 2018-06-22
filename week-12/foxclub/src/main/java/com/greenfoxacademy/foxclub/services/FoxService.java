package com.greenfoxacademy.foxclub.services;

import org.springframework.stereotype.Service;

@Service
public interface FoxService {
    public void setFoxName(String name);
    public void getFoxName();
}
