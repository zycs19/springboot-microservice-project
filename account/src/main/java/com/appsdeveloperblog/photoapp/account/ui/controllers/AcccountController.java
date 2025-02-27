package com.appsdeveloperblog.photoapp.account.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AcccountController {

    @Autowired
    Environment env;

    @GetMapping("/status/check")
    public String status() {
        return new String("Working at port " + env.getProperty("local.server.port"));
    }
}