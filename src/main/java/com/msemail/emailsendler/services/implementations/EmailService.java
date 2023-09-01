package com.msemail.emailsendler.services.implementations;

import com.msemail.emailsendler.enums.StatusEmail;
import com.msemail.emailsendler.model.EmailModel;
import com.msemail.emailsendler.repositories.IEmailRepository;
import com.msemail.emailsendler.services.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailService implements IEmailService {
    @Autowired
    private IEmailRepository emailRepository;
    @Autowired
    private JavaMailSender mailSender;

    public void execute(EmailModel emailModel) {
        try {
            emailModel.setSendDateEmail(LocalDateTime.now());
            SimpleMailMessage message = new SimpleMailMessage();
            message.setSubject(emailModel.getSubject());
            message.setText(emailModel.getText());
            message.setFrom(emailModel.getEmailFrom());
            message.setTo(emailModel.getEmailTo());
            //mailSender.send(message);

            emailModel.setStatusEmail(StatusEmail.SENT);
        } catch (MailException exception) {
            emailModel.setStatusEmail(StatusEmail.ERROR);
        } finally {
            this.emailRepository.save(emailModel);
        }

    }
}
