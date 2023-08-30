package com.msemail.emailsendler.Dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record EmailDto(
        @NotBlank
        UUID ownerRef,
        @NotBlank @Email

        String emailFrom,
        @NotBlank @Email
        String emailTo,
        @NotBlank
        String subject,
        @NotBlank
        String text
) {

}
