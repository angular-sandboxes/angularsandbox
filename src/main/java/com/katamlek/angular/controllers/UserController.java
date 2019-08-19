package com.katamlek.angular.controllers;

import com.katamlek.angular.domain.User;
import org.springframework.web.bind.annotation.*;
import com.katamlek.angular.repositories.UserRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
