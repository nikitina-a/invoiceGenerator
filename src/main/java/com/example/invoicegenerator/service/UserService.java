package com.example.invoicegenerator.service;

import com.example.invoicegenerator.model.User;
import com.example.invoicegenerator.persistence.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User createUser(User user) {
      
        this.userRepo.save(user);
        return user;
    }
}
