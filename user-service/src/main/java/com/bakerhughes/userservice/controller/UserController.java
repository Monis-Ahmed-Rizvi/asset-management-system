package com.bakerhughes.userservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "This will return all users";
    }

    @GetMapping("/{userId}")
    public String getUserById(@PathVariable String userId) {
        return "This will return user with ID: " + userId;
    }

    @PostMapping
    public String createUser(@RequestBody String userDetails) {
        return "This will create a new user: " + userDetails;
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable String userId, @RequestBody String userDetails) {
        return "This will update user with ID: " + userId + " with details: " + userDetails;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "This will delete user with ID: " + userId;
    }
}