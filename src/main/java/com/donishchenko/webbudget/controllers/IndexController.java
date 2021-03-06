package com.donishchenko.webbudget.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String mainPage(Model model){
        return "index";
    }

    @RequestMapping(value = "/security", method = RequestMethod.GET)
    public String securityMainPage(Model model) {
        return "indexSecurity";
    }
}