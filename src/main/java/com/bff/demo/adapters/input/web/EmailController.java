package com.bff.demo.adapters.input.web;

import com.bff.demo.adapters.input.dto.MailSendDTO;
import com.bff.demo.adapters.input.dto.ResponseDTO;
import com.bff.demo.domain.usecase.SendMailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "Controller de envio de e-mails", description = "Controller desenvolvido para testar a comunicação com a api " +
        "de envio de e-mails, futarmente vai ser removido.")
@RestController
@RequestMapping("/sendEmail")
public class EmailController {
    @Autowired
    private SendMailService send;
    @Operation(summary = "Faz um Post enviando os dados para o e-mail.", description = "Envia um e-mail com os dados" +
            " informados.")
    @PostMapping()
    public ResponseEntity<ResponseDTO> enviaEmail(@RequestBody MailSendDTO sendDTO) {
        return ResponseEntity.ok().body(send.sendMailInput(sendDTO));
    }

}
