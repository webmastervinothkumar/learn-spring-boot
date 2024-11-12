package com.webmaster.learnrestapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webmaster.learnrestapi.model.User;
import com.webmaster.learnrestapi.service.UserDaoService;

@RestController
public class UserController {

    private UserDaoService service;

    public UserController(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable long id) {
        return service.findOne(id);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> addUser(@RequestBody User user) {
        service.createUser(user);
        return ResponseEntity.created(null).build();
    }
}
