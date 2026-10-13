package com.shopsphere.common.event;

import com.shopsphere.common.enums.PaymentStatus;

import java.time.Instant;

public record PaymentProcessedEvent(
        Long orderId,
        String paymentReference,
        PaymentStatus status,
        String failureReason,
        Instant processedAt) {
}
