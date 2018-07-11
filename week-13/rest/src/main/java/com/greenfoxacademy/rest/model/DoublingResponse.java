package com.greenfoxacademy.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.stereotype.Component;

@Component
public class DoublingResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer received;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer result;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;

    public DoublingResponse() {
    }

    public DoublingResponse(Integer received, Integer result, String error) {
        this.received = received;
        this.result = result;
        this.error = error;
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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
