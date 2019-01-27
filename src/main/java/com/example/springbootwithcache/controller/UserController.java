package com.example.springbootwithcache.controller;

import com.example.springbootwithcache.domain.User;
import com.example.springbootwithcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    @Autowired
    UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        long start = System.currentTimeMillis();
        List<User> all = userService.findAll();
        long elapsed = System.currentTimeMillis() - start;
        System.out.println(elapsed);
        return all;
    }

    @PutMapping(value = "/update")
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
