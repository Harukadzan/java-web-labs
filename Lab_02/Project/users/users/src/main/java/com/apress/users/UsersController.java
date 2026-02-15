package com.apress.users;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UsersController {

    // in-memory storage
    private Map<String, User> users = new HashMap<>();

    // constructor with sample users
    public UsersController() {

        users.put(
                "ximena@email.com",
                new User("ximena@email.com", "Ximena")
        );

        users.put(
                "norma@email.com",
                new User("norma@email.com", "Norma")
        );
    }

    // GET all users
    @GetMapping
    public Collection<User> getAllUsers() {
        return users.values();
    }

    // GET user by email
    @GetMapping("/{email}")
    public User findUserByEmail(@PathVariable String email) {
        return users.get(email);
    }

    // POST create user
    @PostMapping
    public User save(@RequestBody User user) {

        users.put(user.getEmail(), user);

        return user;
    }

    // DELETE user
    @DeleteMapping("/{email}")
    public void deleteByEmail(@PathVariable String email) {

        users.remove(email);
    }
}
