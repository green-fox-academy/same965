package com.greenfoxacademy.rest.model;

import org.springframework.stereotype.Component;

@Component
public class Doubling {
    private Integer received;
    private Integer result;

    public Doubling() {
    }

    public Doubling(Integer received, Integer result) {
        this.received = received;
        this.result = result;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
