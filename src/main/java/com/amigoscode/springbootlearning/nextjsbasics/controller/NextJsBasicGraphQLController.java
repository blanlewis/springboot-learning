package com.amigoscode.springbootlearning.nextjsbasics.controller;

import com.amigoscode.springbootlearning.nextjsbasics.entity.UserEntity;
import com.amigoscode.springbootlearning.nextjsbasics.service.UserService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class NextJsBasicGraphQLController {

    private final UserService userService;

    public NextJsBasicGraphQLController(UserService userService) {
        this.userService = userService;
    }

    @QueryMapping
    public List<UserEntity> nextJsBasicUsers() {
        return userService.getUsers();
    }
}