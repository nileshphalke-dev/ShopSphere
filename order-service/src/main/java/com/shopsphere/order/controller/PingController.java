package com.shopsphere.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Smoke-test endpoint. Delete once real controllers exist. */
@RestController
public class PingController {

    @GetMapping("/api/orders/ping")
    public String ping() {
        return "order-service is up";
    }
}
