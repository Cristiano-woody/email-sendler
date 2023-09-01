package com.msemail.emailsendler.model;

import com.msemail.emailsendler.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name="Email")
public class EmailModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;

    public UUID getEmailId() {
        return emailId;
    }

    public void setEmailId(UUID emailId) {
        this.emailId = emailId;
    }

    public UUID getOwnerRef() {
        return ownerRef;
    }

    public void setOwnerRef(UUID ownerRef) {
        this.ownerRef = ownerRef;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getSendDateEmail() {
        return sendDateEmail;
    }

    public void setSendDateEmail(LocalDateTime sendDateEmail) {
        this.sendDateEmail = sendDateEmail;
    }

    public StatusEmail getStatusEmail() {
        return statusEmail;
    }

    public void setStatusEmail(StatusEmail statusEmail) {
        this.statusEmail = statusEmail;
    }

    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
