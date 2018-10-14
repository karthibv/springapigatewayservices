package com.kk.grpsrv.kafka.cosumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.kk.grpsrv.service.GroupService;
import com.kk.usersrv.entity.User;

import java.util.concurrent.CountDownLatch;

public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch = new CountDownLatch(1);

    @Autowired
    private GroupService groupService;

    @KafkaListener(topics = "${spring.kafka.topic.userCreated}")
    public void receive(User payload) {
        LOGGER.info("received payload='{}'", payload);
        groupService.createOrg(payload);
        latch.countDown();
    }
}