package com.study.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/first-service")
@RestController
public class FirstServiceController {

    @GetMapping("/check")
    public String check() {
        return "first service.";
    }
}
