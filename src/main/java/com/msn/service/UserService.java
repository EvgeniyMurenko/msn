package com.msn.service;

import com.msn.domain.User;
import com.msn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(Boolean active) {
        return userRepository.findAllByActive(active);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public User updateUser(User userFromDb) {
        return userRepository.save(userFromDb);
    }
}
