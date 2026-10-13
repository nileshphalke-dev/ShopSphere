package com.shopsphere.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Smoke-test endpoint. Delete once real controllers exist. */
@RestController
public class PingController {

    @GetMapping("/api/payments/ping")
    public String ping() {
        return "payment-service is up";
    }
}
