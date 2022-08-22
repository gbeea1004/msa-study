package com.study.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/first-service/users")
@RestController
public class UserController {

    @GetMapping
    public String searchUsers() {
        return "users 조회!";
    }
}
