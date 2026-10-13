package com.shopsphere.common.event;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public record OrderCreatedEvent(
        Long orderId,
        Long userId,
        String userEmail,
        BigDecimal totalAmount,
        List<OrderItemEvent> items,
        Instant createdAt) {
}
