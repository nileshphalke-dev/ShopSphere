# ShopSphere architecture notes

Keep your architecture diagram, ADRs (why Kafka, why JWT) and Postman collection in this folder.

## Core flow
1. User registers/logs in via auth-service and receives a JWT.
2. api-gateway validates the JWT and routes the request.
3. order-service reserves stock in inventory-service (Feign + circuit breaker), saves the order as PENDING and publishes `order.created`.
4. payment-service consumes it, processes the payment and publishes `payment.processed`.
5. order-service sets the order to CONFIRMED or CANCELLED (compensation releases stock on failure).
6. notification-service consumes the events and sends emails.
