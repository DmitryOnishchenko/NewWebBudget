package com.donishchenko.webbudget.model;

import java.math.BigDecimal;

public class Account {
    private long id;
    private String name;
    private Money money;
    private User user;

    public static void main(String[] args) {
        Money m1 = new Money(new BigDecimal("500"));
        Money m2 = new Money(new BigDecimal("1000"));

        System.out.println(m1.divide(m2).getAmount());
    }
}
