package com.donishchenko.webbudget.dao;

import com.donishchenko.webbudget.model.AccountTransaction;

import java.sql.SQLException;

public interface AccountTransactionDao {
    long create(AccountTransaction accountTransaction) throws SQLException;
    AccountTransaction get(long id) throws SQLException;
    AccountTransaction get(AccountTransaction accountTransaction) throws SQLException;
    void update(AccountTransaction accountTransaction) throws SQLException;
    void delete(long id) throws SQLException;
    void delete(AccountTransaction accountTransaction) throws SQLException;
}
