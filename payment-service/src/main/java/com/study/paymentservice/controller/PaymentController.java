package com.study.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/second-service/payments")
@RestController
public class PaymentController {

    @GetMapping
    public String payment() {
        return "결제 정보 조회!";
    }
}
