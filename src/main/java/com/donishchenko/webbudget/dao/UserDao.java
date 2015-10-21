package com.donishchenko.webbudget.dao;

import com.donishchenko.webbudget.model.User;

import java.sql.SQLException;

public interface UserDao {
    long create(User user) throws SQLException;
    User get(long id) throws SQLException;
    User get(User user) throws SQLException;
    void update(User user) throws SQLException;
    void delete(long id) throws SQLException;
    void delete(User user) throws SQLException;
}
