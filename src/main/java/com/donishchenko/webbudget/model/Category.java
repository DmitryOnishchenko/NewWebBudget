package com.donishchenko.webbudget.model;

import com.google.common.base.Joiner;

public class Category {
    private long id;
    private String name;
    private User user;

    public Category() {}

    public Category(long id, String name, User user) {
        this.id = id;
        this.name = name;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return Joiner.on("").join("Category[id=", id, ",name=", name, ",userId=", user.getId());
    }
}
