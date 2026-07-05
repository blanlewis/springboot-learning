package com.amigoscode.springbootlearning.nextjsbasics.service;

import com.amigoscode.springbootlearning.nextjsbasics.entity.UserEntity;
import com.amigoscode.springbootlearning.nextjsbasics.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}