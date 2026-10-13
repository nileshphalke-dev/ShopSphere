package com.shopsphere.report.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/** Define Job / Step beans here. Scheduling is enabled for nightly jobs. */
@Configuration
@EnableScheduling
public class BatchConfig {
}
