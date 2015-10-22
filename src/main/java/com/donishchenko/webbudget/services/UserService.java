package com.donishchenko.webbudget.services;

import com.donishchenko.webbudget.model.User;

public interface UserService {

    User getUser(String login);
}
