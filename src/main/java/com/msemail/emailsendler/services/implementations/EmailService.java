package com.msemail.emailsendler.services.implementations;

import com.msemail.emailsendler.model.EmailModel;
import com.msemail.emailsendler.repositories.IEmailRepository;
import com.msemail.emailsendler.services.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailService implements IEmailService {
    @Autowired
    IEmailRepository emailRepository;

    @Override
    public void execute(EmailModel emailModel) {

    }
}
