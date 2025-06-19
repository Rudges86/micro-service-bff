package com.bff.demo.adapters.output.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErroMessageDTO {
    private String statusCode;
    private String message;
    private List<String> listaErros;

    public ErroMessageDTO() {
    }

    public ErroMessageDTO(String statusCode, String message, List<String> listaErros) {
        this.statusCode = statusCode;
        this.message = message;
        this.listaErros = listaErros;
    }

    public ErroMessageDTO(String statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getListaErros() {
        return listaErros;
    }
}
