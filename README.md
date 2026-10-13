# ShopSphere
<<<<<<< HEAD

E-commerce microservices platform for Spring Boot practice and interview preparation.

**Stack:** Java 21, Spring Boot 4.1.1, Spring Cloud 2025.1.2, Spring Data JPA, Spring Security, Kafka, Redis, MySQL, MongoDB, Flyway, Maven (multi-module).

## Modules and ports

| Module | Port | Notes |
|---|---|---|
| config-server | 8888 | Start first |
| discovery-server | 8761 | Eureka dashboard: http://localhost:8761 |
| api-gateway | 8080 | Single entry point |
| auth-service | 8081 | MySQL `auth_db`, Redis |
| product-service | 8082 | MySQL `product_db`, Redis |
| inventory-service | 8083 | MySQL `inventory_db` |
| order-service | 8084 | MySQL `order_db`, Kafka, Feign |
| payment-service | 8085 | MySQL `payment_db`, Kafka |
| notification-service | 8086 | Kafka, MailHog |
| review-service | 8087 | MongoDB |
| report-batch-service | 8088 | MySQL `report_db`, Spring Batch |
| common-lib | - | Shared events, exceptions, BaseEntity |

## Open in IntelliJ

1. File > Open > select the root `pom.xml` > **Open as Project**.
2. Set Project SDK to JDK 21 (File > Project Structure > Project).
3. Settings > Build > Compiler > Annotation Processors > **Enable annotation processing** (needed for Lombok and MapStruct).
4. Maven tool window > Reload All Maven Projects.

## Build

```
mvn clean install
```

## Run locally

1. Start infrastructure: `docker compose up -d mysql redis` (add `kafka mailhog mongo zipkin` when needed).
2. Start services in this order: config-server, discovery-server, then any business service, then api-gateway.
3. Smoke test through the gateway:
   - http://localhost:8080/api/products/ping
   - http://localhost:8080/api/auth/ping
   - http://localhost:8080/api/orders/ping

Services work without the config server (the import is optional), and Eureka errors in the logs are harmless if the discovery server is not running.

## Build order (suggested)

1. product-service: entities, repository, service, controller, validation, exception handling, pagination, caching, tests
2. auth-service: JWT, roles, refresh tokens, security tests
3. Replace the temporary `permitAll` SecurityConfig in each service with JWT validation
4. inventory-service, order-service (Feign, Resilience4j)
5. Kafka flow: payment-service, notification-service, saga
6. Observability: tracing + Zipkin, Prometheus, correlation id
7. review-service, report-batch-service, Testcontainers, CI

## Next steps (intentionally not added yet)

- **Swagger/springdoc:** add once a release that supports Spring Boot 4.1 is confirmed on the springdoc releases page.
- **Distributed tracing + Zipkin, Prometheus:** add in the observability phase using the Spring Boot 4 starters.
- **Testcontainers:** add `testcontainers-*` modules managed by the Spring Boot BOM when you write integration tests.
- **JaCoCo threshold:** `jacoco.minimum.coverage` in the parent POM is 0.00 now. Raise it to 0.80 later.
=======
ShopSphere E-commerce Microservices project in Spring Boot 
>>>>>>> 85d1473b58ac08d304aff6ac1380a24f6b49a9d0
