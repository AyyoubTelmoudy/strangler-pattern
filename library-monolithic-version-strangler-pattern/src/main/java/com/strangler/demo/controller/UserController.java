package com.strangler.demo.controller;

import com.strangler.demo.facade.UserFacade;
import com.strangler.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserFacade userFacade;

    @GetMapping
    public List<User> getAllUsers() {
        return userFacade.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userFacade.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userFacade.createUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userFacade.deleteUser(id);
    }

}