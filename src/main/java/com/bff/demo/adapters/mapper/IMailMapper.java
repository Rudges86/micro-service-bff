package com.bff.demo.adapters.mapper;

import com.bff.demo.adapters.input.dto.MailSendDTO;
import com.bff.demo.adapters.input.dto.ResponseDTO;
import com.bff.demo.domain.model.mail.MailModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;

@Mapper(componentModel = "spring")
public interface IMailMapper {
    MailModel mailMapper(MailSendDTO sendDTO);

}
