package com.bff.demo.adapters.input.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDTO<T> {
    private String message;
    private HttpStatus statusCode;
    private T content;

    public ResponseDTO() {
    }

    public ResponseDTO(String message, HttpStatus statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public ResponseDTO(String message, HttpStatus statusCode, T content) {
        this.message = message;
        this.statusCode = statusCode;
        this.content = content;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
