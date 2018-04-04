package com.ohmyplay.exception;

import org.springframework.http.HttpStatus;

public class OhmyplayException extends RuntimeException{

    private HttpStatus status;
    private String errorMessage;

    public OhmyplayException(HttpStatus status, String errorMessage) {
        this.status = status;
        this.errorMessage = errorMessage;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
