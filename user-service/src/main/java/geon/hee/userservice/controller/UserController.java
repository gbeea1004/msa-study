package geon.hee.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${greeting.message}")
    private String message;

    @GetMapping("/welcome")
    public String status() {
        return message + "유저 서비스!";
    }
}
