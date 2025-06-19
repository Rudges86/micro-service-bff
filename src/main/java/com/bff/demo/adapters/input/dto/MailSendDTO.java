package com.bff.demo.adapters.input.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Detalhes de requisição de um e-mail")
public record MailSendDTO(
        @Schema(description = "Exemplo de corpo do e-mail", example = "E-mail enviado")
        String body,
        @Schema(description = "Exemplo destinatário", example = "destinatario@gmail.com")
        String to,
        @Schema(description = "Exemplo de assunto", example = "Exemplo de e-mail.")
        String subject) {
}
