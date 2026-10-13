package com.shopsphere.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.shopsphere.report", "com.shopsphere.common"})
public class ReportBatchServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportBatchServiceApplication.class, args);
    }
}
