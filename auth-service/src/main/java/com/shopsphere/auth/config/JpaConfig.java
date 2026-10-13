package com.shopsphere.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/** Enables @CreatedDate / @LastModifiedDate on BaseEntity. */
@Configuration
@EnableJpaAuditing
public class JpaConfig {
}
