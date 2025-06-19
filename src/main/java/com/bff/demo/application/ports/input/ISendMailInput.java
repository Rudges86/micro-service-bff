package com.bff.demo.application.ports.input;

import com.bff.demo.adapters.input.dto.MailSendDTO;
import com.bff.demo.adapters.input.dto.ResponseDTO;

public interface ISendMailInput {
    ResponseDTO sendMailInput(MailSendDTO mailSendDTO);
}
