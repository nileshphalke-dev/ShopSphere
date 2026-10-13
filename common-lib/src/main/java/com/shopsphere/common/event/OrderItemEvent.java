package com.shopsphere.common.event;

import java.math.BigDecimal;

public record OrderItemEvent(Long productId, int quantity, BigDecimal unitPrice) {
}
