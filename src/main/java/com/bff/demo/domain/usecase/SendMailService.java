package com.bff.demo.domain.usecase;

import com.bff.demo.adapters.input.dto.MailSendDTO;
import com.bff.demo.adapters.input.dto.ResponseDTO;
import com.bff.demo.adapters.mapper.IMailMapper;
import com.bff.demo.application.ports.input.ISendMailInput;
import com.bff.demo.application.ports.output.IMailClientOutPut;
import org.springframework.stereotype.Component;

@Component
public class SendMailService implements ISendMailInput {

    private IMailClientOutPut client;
    private IMailMapper mapper;

    public SendMailService(IMailClientOutPut client, IMailMapper mapper) {
        this.client = client;
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO sendMailInput(MailSendDTO mailSendDTO) {
        return client.sendMail(mapper.mailMapper(mailSendDTO));
    }
}
