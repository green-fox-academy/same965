package com.greenfoxacademy.foxclub.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoginName {
    List<String> loginName;

    public LoginName() {
        this.loginName = new ArrayList<>();
    }

    public List<String> getLoginName() {
        return loginName;
    }

    public void setLoginName(List<String> loginName) {
        this.loginName = loginName;
    }

//    public void add(String name) {
//        loginName.add(name);
//    }
//
//    public boolean check(String name) {
//        return loginName.contains(name);
//    }
}

