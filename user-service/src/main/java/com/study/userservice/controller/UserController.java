package com.study.userservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/first-service/users")
@RestController
public class UserController {

    @GetMapping
    public String searchUsers(@RequestHeader("first-request") String header) {
        log.info("header: {}", header);
        return "users 조회!";
    }
}
