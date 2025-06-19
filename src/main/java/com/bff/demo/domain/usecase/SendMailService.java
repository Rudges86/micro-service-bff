package com.bff.demo.domain.usecase;

import com.bff.demo.adapters.input.dto.MailSendDTO;
import com.bff.demo.adapters.input.dto.ResponseDTO;
import com.bff.demo.adapters.mapper.IMailMapper;
import com.bff.demo.application.ports.input.ISendMailInput;
import com.bff.demo.application.ports.output.IMailClientOutPut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendMailService implements ISendMailInput {
    @Autowired
    private IMailClientOutPut client;
    @Override
    public ResponseDTO sendMailInput(MailSendDTO mailSendDTO) {
        return IMailMapper.INSTANCE.responseMapper(client.sendMail(IMailMapper.INSTANCE.mailMapper(mailSendDTO)));
    }
}
