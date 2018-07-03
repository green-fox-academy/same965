package com.greenfoxacademy.rest.model;

import org.springframework.stereotype.Component;

@Component
public class DoUntil {
    private Integer result;

    public DoUntil() {
    }

    public DoUntil(Integer result) {
        this.result = result;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
