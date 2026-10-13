package com.shopsphere.common.event;

/** Central place for Kafka topic names used by order, payment and notification services. */
public final class KafkaTopics {

    public static final String ORDER_CREATED = "order.created";
    public static final String PAYMENT_PROCESSED = "payment.processed";
    public static final String STOCK_RELEASE = "inventory.stock-release";

    private KafkaTopics() {
    }
}
