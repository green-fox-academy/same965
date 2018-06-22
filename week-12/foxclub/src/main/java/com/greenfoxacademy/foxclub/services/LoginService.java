package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.LoginName;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    public void addLoginName(String name);
    public boolean checkLoginName(String name);
}
