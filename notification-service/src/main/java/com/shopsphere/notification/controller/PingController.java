package com.shopsphere.notification.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Smoke-test endpoint. Delete once real controllers exist. */
@RestController
public class PingController {

    @GetMapping("/api/notifications/ping")
    public String ping() {
        return "notification-service is up";
    }
}
