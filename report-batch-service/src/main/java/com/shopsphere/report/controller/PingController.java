package com.shopsphere.report.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Smoke-test endpoint. Delete once real controllers exist. */
@RestController
public class PingController {

    @GetMapping("/api/reports/ping")
    public String ping() {
        return "report-batch-service is up";
    }
}
