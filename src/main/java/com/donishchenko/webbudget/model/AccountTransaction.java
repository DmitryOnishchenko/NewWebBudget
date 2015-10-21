package com.donishchenko.webbudget.model;

import com.google.common.base.Joiner;

import java.util.Date;

public class AccountTransaction {
    private long id;
    private Date date;
    private Money amount;
    private Account account;
    private Category category;
    private String comment;

    public AccountTransaction() {}

    public AccountTransaction(Date date, Money amount, Account account, Category category, String comment) {
        this.date = date;
        this.amount = amount;
        this.account = account;
        this.category = category;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return Joiner.on("").join("AccountTransaction[id=", id, ",date=", date, ",money=", amount,
                ",account=", account.getId(), ",category=", category, ",comment=", comment);
    }
}
