package com.msemail.emailsendler.Dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class EmailDto {

        @NotNull
        private UUID ownerRef;
        @NotBlank
        @Email
        private String emailFrom;
        @NotBlank
        @Email
        private String emailTo;
        @NotBlank
        private String subject;
        @NotBlank
        private String text;

}