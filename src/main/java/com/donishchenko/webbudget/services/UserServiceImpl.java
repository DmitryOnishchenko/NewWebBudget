package com.donishchenko.webbudget.services;

import com.donishchenko.webbudget.model.User;

public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setUsername(login);
        user.setPassword("8cb2237d0679ca88db6464eac60da96345513964");

        return user;
    }
}
