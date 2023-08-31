package com.msemail.emailsendler.services;

import com.msemail.emailsendler.model.EmailModel;
import com.msemail.emailsendler.repositories.IEmailRepository;

public interface IEmailService {
    void execute(EmailModel emailModel);
}
