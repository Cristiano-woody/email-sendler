package com.msemail.emailsendler.controllers;

import com.msemail.emailsendler.Dtos.EmailDto;
import com.msemail.emailsendler.model.EmailModel;
import com.msemail.emailsendler.services.IEmailService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    IEmailService emailService;

    @PostMapping("/send-email")
    public ResponseEntity<Object> sendEmail(@RequestBody @Valid EmailDto emailDto) {
        try {
            EmailModel email = new EmailModel();
            BeanUtils.copyProperties(emailDto, email);
            emailService.execute(email);

        } catch ( Error error) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("");
        }
        return null;
    }

}
