package com.bff.demo.adapters.input.web;

import com.bff.demo.adapters.input.dto.MailSendDTO;
import com.bff.demo.adapters.input.dto.ResponseDTO;
import com.bff.demo.domain.usecase.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sendEmail")
public class EmailController {
    @Autowired
    private SendMailService send;

    @PostMapping()
    public ResponseEntity<ResponseDTO> enviaEmail(@RequestBody MailSendDTO sendDTO) {
        return ResponseEntity.ok().body(send.sendMailInput(sendDTO));
    }

}
