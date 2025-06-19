package com.bff.demo.adapters.input.dto;

import org.springframework.http.HttpStatus;

public record ResponseDTO(String message, HttpStatus status) {
}
