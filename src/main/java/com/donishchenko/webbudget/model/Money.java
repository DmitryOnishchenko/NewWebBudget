package com.donishchenko.webbudget.model;

import java.math.BigDecimal;

public class Money {
    private static int ROUNDING_MODE = BigDecimal.ROUND_HALF_EVEN;

    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money plus(Money other) {
        amount = amount.add(other.amount);
        return new Money(amount);
    }

    public Money minus(Money other) {
        amount = amount.subtract(other.amount);
        return new Money(amount);
    }

    public Money divide(Money other) {
        amount = amount.divide(other.amount, ROUNDING_MODE);
        return new Money(amount);
    }

    public Money multiply(Money other) {
        amount = amount.multiply(other.amount);
        return new Money(amount);
    }
}
