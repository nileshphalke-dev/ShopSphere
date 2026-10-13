package com.shopsphere.review.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Smoke-test endpoint. Delete once real controllers exist. */
@RestController
public class PingController {

    @GetMapping("/api/reviews/ping")
    public String ping() {
        return "review-service is up";
    }
}
