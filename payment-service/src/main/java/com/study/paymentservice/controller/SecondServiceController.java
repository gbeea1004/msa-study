package com.study.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/second-service")
@RestController
public class SecondServiceController {

    @GetMapping("/check")
    public String check() {
        return "second service.";
    }
}
