package com.kk.emailsrv.repository;

import org.springframework.data.repository.CrudRepository;

import com.kk.emailsrv.entity.Mail;


public interface MailRepository extends CrudRepository<Mail, Long> {

}