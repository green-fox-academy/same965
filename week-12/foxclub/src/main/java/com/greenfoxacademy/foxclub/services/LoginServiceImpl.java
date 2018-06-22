package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.LoginName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    private LoginName loginName;

    @Autowired
    public LoginServiceImpl(LoginName loginName) {
        this.loginName = loginName;
    }

    public void addLoginName(String name) {
        loginName.add(name);
    }

    public boolean checkLoginName(String name) {
        return loginName.check(name);
    }
}
