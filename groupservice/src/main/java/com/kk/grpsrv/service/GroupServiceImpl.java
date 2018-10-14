package com.kk.grpsrv.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.kk.usersrv.entity.User;
@Component
public class GroupServiceImpl implements GroupService{
    private static final Logger LOGGER = LoggerFactory.getLogger(GroupServiceImpl.class);

	@Override
	public void createOrg(User input) {
		// TODO Auto-generated method stub
        LOGGER.info("GroupServiceImpl input='{}'", input);

	}

	@Override
	public void updateOrg(User input) {
		// TODO Auto-generated method stub
		
	}

}
