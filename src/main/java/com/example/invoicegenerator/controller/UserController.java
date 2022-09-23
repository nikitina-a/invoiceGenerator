package com.example.invoicegenerator.controller;

import com.example.invoicegenerator.model.User;
import com.example.invoicegenerator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/user")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }


    @PostMapping(path = "/new")
    public User createUser(@RequestBody User user) {
        return this.service.createUser(user);
    }
}
