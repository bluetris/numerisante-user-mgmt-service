package com.numerisante.usermgmt.service;

import com.numerisante.usermgmt.entity.User;

public interface UserService {

    public User createUser(final User user);

    public User getUserById(String User userId );

}