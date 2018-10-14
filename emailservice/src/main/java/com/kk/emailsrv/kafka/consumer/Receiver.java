package com.kk.emailsrv.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.kk.emailsrv.service.EmailService;
import com.zc.model.UserEvent;

import java.util.concurrent.CountDownLatch;

public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch = new CountDownLatch(1);

    @Autowired
    private EmailService emailService;

    @KafkaListener(topics = "${spring.kafka.topic.userCreated}")
    public void receive(UserEvent payload) {
        LOGGER.info("received payload='{}'", payload);
        emailService.sendSimpleMessage(payload);
        latch.countDown();
    }
}