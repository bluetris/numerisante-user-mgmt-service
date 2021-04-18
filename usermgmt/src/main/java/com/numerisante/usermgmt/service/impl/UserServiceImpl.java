package com.numerisante.usermgmt.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numerisante.usermgmt.entity.User;
import com.numerisante.usermgmt.enums.UserStatus;
import com.numerisante.usermgmt.exception.NoDataFoundException;
import com.numerisante.usermgmt.repository.UsermgmtRepository;
import com.numerisante.usermgmt.service.UserService;
import com.numerisante.usermgmt.service.utils.Utility;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UsermgmtRepository userMgmtRepository;

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User createUser(final User user) {
        String userId=Utility.getUUIDString();
        user.setUserId(userId);
        Utility.setChildIds(user);
        return userMgmtRepository.save(user);
    }
}