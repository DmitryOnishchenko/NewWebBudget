package com.donishchenko.webbudget.model;

import java.util.Calendar;

public class TestObject {
    private Calendar time;
    private String message;

    public TestObject(Calendar time, String message) {
        this.time = time;
        this.message = message;
    }

    public TestObject() {}

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
