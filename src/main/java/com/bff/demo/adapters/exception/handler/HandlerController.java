package com.bff.demo.adapters.exception.handler;

import com.bff.demo.adapters.output.dto.ErroMessageDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerController {
    private static final Logger logger = LoggerFactory.getLogger(HandlerController.class);
    @ExceptionHandler(FeignException.FeignClientException.class)
    public ResponseEntity<ErroMessageDTO> feignException(FeignException ex, HttpServletRequest request)  {
        logger.error("Erro no endereço: " + request.getRequestURI());
        try {
            ObjectMapper mapper = new ObjectMapper();
            ErroMessageDTO erroMessageDTO =  mapper.readValue(ex.contentUTF8(), ErroMessageDTO.class);
            return ResponseEntity.badRequest().body(erroMessageDTO);
        } catch (JsonProcessingException e) {
            return ResponseEntity.internalServerError().body(new ErroMessageDTO(HttpStatus.INTERNAL_SERVER_ERROR.name(),
                    "Erro ao processar o tratamento do erro"));
        }
    }
}
