package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private AtomicLong id;
    private String content;

    public Greeting() {
        this.id = new AtomicLong(0L);
    }

    public Greeting(String content) {
        this.id = new AtomicLong(0L);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AtomicLong getId() {
        return id;
    }

    public long counter() {
        return id.getAndIncrement();
    }
}
