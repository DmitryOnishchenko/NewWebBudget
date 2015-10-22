package com.donishchenko.webbudget.controllers;

import com.donishchenko.webbudget.DB;
import com.donishchenko.webbudget.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@RequestParam("id") long id) {
        User user = DB.users.get(id);

        if (user == null) {
            user = new User("", "", "");
        }

        return user;
    }
}
