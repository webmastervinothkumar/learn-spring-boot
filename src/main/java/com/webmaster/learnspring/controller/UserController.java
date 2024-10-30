package com.webmaster.learnspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webmaster.learnspring.entity.User;
import com.webmaster.learnspring.service.UserService;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User savedUser = userService.addUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @PostMapping("/users/createdata")
    public ResponseEntity<String> createData() {
        var user  = new User("Jessica Kumar","jessicakumar@me.com");
        userService.addUser(user);
        var user2  = new User("John Doe","johndoe@me.com");
        userService.addUser(user2);
        var user3  = new User("Jane Doe","janedoe@me.com");
        userService.addUser(user3);
        return new ResponseEntity<>("Data Setup Complete", HttpStatus.CREATED);
    }
}
