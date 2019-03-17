package com.juana.controller;

import com.juana.core.domain.User;
import com.juana.core.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by juana on 2018. 12. 9..
 */

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable final Integer id) {
        return userService.getUser(id);
    }

    @GetMapping
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        log.info(">>>>>> controller...");
        log.info(user.getPasswd());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        log.info(passwordEncoder.encode(user.getPasswd()));
        user.setPasswd(passwordEncoder.encode(user.getPasswd()));

        return userService.createUser(user);
    }
}
