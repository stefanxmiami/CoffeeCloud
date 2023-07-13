package com.siv.coffeecloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.siv.coffeecloud.model.User;
import com.siv.coffeecloud.repository.UserRepository;

import java.util.Optional;

@Service
public record UserService(UserRepository userRepository) {

    @Autowired
    public UserService {
    }

    public User saveUser(User user) {
        // Here you might add some business logic, like checking if a user with the same username already exists.
        return userRepository.save(user);
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    // add more methods as needed
}
