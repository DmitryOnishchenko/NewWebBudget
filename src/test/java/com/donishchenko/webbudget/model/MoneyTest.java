package com.donishchenko.webbudget.model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class MoneyTest extends Assert {

    @Test
    public void testDefaultConstructor() {
        Money defaultMoney = new Money();
        assertEquals("toString() values", "0.00", defaultMoney.toString());
        assertNotEquals("toString() values", "0", defaultMoney.toString());
        assertTrue("eq()", defaultMoney.eq(new Money()));
    }

    @Test
    public void testLongConstructor() {
        Money longMoney = new Money(1_000l);
        assertEquals("toString() values", "1000.00", longMoney.toString());
        assertNotEquals("toString() values", "1000", longMoney.toString());
        assertTrue("eq()", longMoney.eq(new Money(1_000l)));
    }

    @Test
    public void testDoubleConstructor() {
        Money doubleMoney = new Money(5.25);
        assertEquals("toString() values", "5.25", doubleMoney.toString());
        assertNotEquals("toString() values", "5", doubleMoney.toString());
        assertTrue("eq()", doubleMoney.eq(new Money(5.25)));
    }

    @Test
    public void testSetAmount() {
        Money money = new Money();
        money.setAmount(new BigDecimal("0.25"));
        assertTrue(money.eq(new Money(0.25)));
    }
}