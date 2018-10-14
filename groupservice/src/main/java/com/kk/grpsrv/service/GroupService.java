package com.kk.grpsrv.service;

import com.kk.usersrv.entity.User;

public interface GroupService {
    void createOrg(User input);
    void updateOrg(User input);

}
