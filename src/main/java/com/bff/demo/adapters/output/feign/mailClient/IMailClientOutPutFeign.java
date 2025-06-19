package com.bff.demo.adapters.output.feign.mailClient;

import com.bff.demo.adapters.input.dto.ResponseDTO;
import com.bff.demo.domain.model.mail.MailModel;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="${feign.mail.name}", url = "${feign.mail.url}")
public interface IMailClientOutPutFeign {


    @PostMapping(value = "${feign.mail.send.path}")
    ResponseEntity<ResponseDTO> sendMail(@RequestBody MailModel mailSend);

}
