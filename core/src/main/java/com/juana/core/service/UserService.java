package com.juana.core.service;

import com.juana.core.domain.User;
import com.juana.core.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(final Integer id) {
        return userRepository.findById(id);
    }

    public List<User> getUserList() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    public User createUser(User user) {
        log.info(">>>>>> service...");
        return userRepository.save(user);
    }
}
