package com.donishchenko.webbudget.model;

import java.math.BigDecimal;

public class Money {
    private static int ROUNDING_MODE = BigDecimal.ROUND_HALF_EVEN;
    private static int DECIMALS = 2;

    private BigDecimal amount;

    public Money() {
        this(new BigDecimal("0.00"));
    }

    public Money(long amount) {
        this(new BigDecimal(amount));
    }

    public Money(double amount) {
        this(new BigDecimal(Double.toString(amount)));
    }

    public Money(BigDecimal amount) {
        this.amount = amount.setScale(DECIMALS, ROUNDING_MODE);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount.setScale(DECIMALS, ROUNDING_MODE);
    }

    public Money plus(Money other) {
        return new Money(amount.add(other.amount));
    }

    public Money minus(Money other) {
        return new Money(amount.subtract(other.amount));
    }

    public Money divide(Money other) {
        return new Money(amount.divide(other.amount, ROUNDING_MODE));
    }

    public Money multiply(Money other) {
        return new Money(amount.multiply(other.amount));
    }

    public boolean eq(Money other) {
        return amount.compareTo(other.amount) == 0;
    }

    @Override
    public String toString() {
        return amount.toString();
    }
}
