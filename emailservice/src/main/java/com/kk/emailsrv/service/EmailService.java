package com.kk.emailsrv.service;

import com.zc.model.UserEvent;

public interface EmailService {

    void sendSimpleMessage(UserEvent input);
}