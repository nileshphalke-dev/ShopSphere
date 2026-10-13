package com.shopsphere.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Smoke-test endpoint. Delete once real controllers exist. */
@RestController
public class PingController {

    @GetMapping("/api/products/ping")
    public String ping() {
        return "product-service is up";
    }
}
