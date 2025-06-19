package com.bff.demo.adapters.output.feign.mailClient;

import com.bff.demo.adapters.input.dto.ResponseDTO;
import com.bff.demo.adapters.output.dto.ErroMessageDTO;
import com.bff.demo.application.ports.output.IMailClientOutPut;
import com.bff.demo.domain.model.mail.MailModel;
import feign.FeignException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class MailClientOutPutFeign implements IMailClientOutPut {
    private final IMailClientOutPutFeign client;

    public MailClientOutPutFeign(IMailClientOutPutFeign client) {
        this.client = client;
    }


    @Override
    public ResponseEntity<ResponseDTO> sendMail(MailModel mail) {
        return client.sendMail(mail);
    }
}
