package com.bff.demo.application.ports.output;

import com.bff.demo.adapters.input.dto.ResponseDTO;
import com.bff.demo.domain.model.mail.MailModel;
import org.springframework.http.ResponseEntity;

public interface IMailClientOutPut {

    ResponseEntity<ResponseDTO> sendMail(MailModel mail);
}
