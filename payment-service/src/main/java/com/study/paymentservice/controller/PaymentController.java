package com.study.paymentservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/second-service/payments")
@RestController
public class PaymentController {

    @GetMapping
    public String payment(@RequestHeader("second-request") String header) {
        log.info("header: {}", header);
        return "결제 정보 조회!";
    }
}
