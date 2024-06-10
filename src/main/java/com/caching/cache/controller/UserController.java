package com.caching.cache.controller;

import com.caching.cache.model.User;
import com.caching.cache.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepo userRepo;

    @GetMapping("/get")
    @Cacheable(value = "defCache")
    public List<User> getAll(){
        return userRepo.findAll();
    }
}
