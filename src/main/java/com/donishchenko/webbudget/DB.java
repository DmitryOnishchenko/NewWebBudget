package com.donishchenko.webbudget;

import com.donishchenko.webbudget.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Test DB
 */
public class DB {
    private static long USER_ID = 1;
    public static Map<Long, User> users = new HashMap<>();

    static {
        createUser("JohnDoe", "123456", "johndoe@gmail.com");
        createUser("DmitryOnishchenko", "qwerty", "dmitryonishchenko@gmail.com");
        createUser("Valeystinos", "v@XW*Y@!g", "v@gmail.com");
        createUser("Tomaro", "tom1956", "d.tomaro1956@gmail.com");
        createUser("Jacob", "j123c", "mr.jacob@gmail.com");
    }

    private static void createUser(String name, String password, String email) {
        User user = new User(name, password, email);
        user.setId(USER_ID++);

        users.put(user.getId(), user);
    }
}
