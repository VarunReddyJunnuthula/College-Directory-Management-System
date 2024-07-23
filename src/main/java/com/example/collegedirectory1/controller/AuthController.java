package com.example.collegedirectory1.controller;


import com.example.collegedirectory1.model.User;
import com.example.collegedirectory1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
        // Authentication logic
        return userService.getUserById(user.getId());
    }
}
