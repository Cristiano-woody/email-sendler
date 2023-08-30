package com.msemail.emailsendler.repositories;

import com.msemail.emailsendler.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IEmailRepository extends JpaRepository<EmailModel, UUID> {

}
