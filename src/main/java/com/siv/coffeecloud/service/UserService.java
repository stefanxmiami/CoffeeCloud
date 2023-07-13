package com.siv.coffeecloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.siv.coffeecloud.model.User;
import com.siv.coffeecloud.repository.UserRepository;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        // Here you might add some business logic, like checking if a user with the same username already exists.
        return userRepository.save(user);
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    public UserRepository userRepository() {
        return userRepository;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (UserService) obj;
        return Objects.equals(this.userRepository, that.userRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userRepository);
    }

    @Override
    public String toString() {
        return "UserService[" +
                "userRepository=" + userRepository + ']';
    }


    // add more methods as needed
}
