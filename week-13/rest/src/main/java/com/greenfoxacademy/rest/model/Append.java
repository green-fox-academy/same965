package com.greenfoxacademy.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

@Component
public class Append {
    @JsonIgnore
    private String append;
    private String appended;

    public Append() {
    }

    public Append(String append, String appended) {
        this.append = append;
        this.appended = appended;
    }

    public String getAppend() {
        return append;
    }

    public void setAppend(String append) {
        this.append = append;
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
