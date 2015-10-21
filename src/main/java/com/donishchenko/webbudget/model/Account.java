package com.donishchenko.webbudget.model;

import com.google.common.base.Joiner;

public class Account {
    private long id;
    private String name;
    private Money money;
    private User user;

    public Account() {}

    public Account(String name, Money money, User user) {
        this.name = name;
        this.money = money;
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

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return Joiner.on("").join("Account[id=", id, ",name=", name, ",money=", money, ",userId=", user.getId());
    }
}
