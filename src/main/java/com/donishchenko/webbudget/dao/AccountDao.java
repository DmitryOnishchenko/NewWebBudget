package com.donishchenko.webbudget.dao;

import com.donishchenko.webbudget.model.Account;

import java.sql.SQLException;

public interface AccountDao {
    long create(Account account) throws SQLException;
    Account get(long id) throws SQLException;
    Account get(Account account) throws SQLException;
    void update(Account account) throws SQLException;
    void delete(long id) throws SQLException;
    void delete(Account account) throws SQLException;
}
