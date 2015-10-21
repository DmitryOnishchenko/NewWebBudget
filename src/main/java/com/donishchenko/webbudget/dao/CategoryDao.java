package com.donishchenko.webbudget.dao;

import com.donishchenko.webbudget.model.Category;

import java.sql.SQLException;

public interface CategoryDao {
    long create(Category category) throws SQLException;
    Category get(long id) throws SQLException;
    Category get(Category category) throws SQLException;
    void update(Category category) throws SQLException;
    void delete(long id) throws SQLException;
    void delete(Category category) throws SQLException;
}
