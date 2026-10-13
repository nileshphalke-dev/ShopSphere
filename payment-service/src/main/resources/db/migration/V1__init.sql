CREATE TABLE payments (
    id                 BIGINT AUTO_INCREMENT PRIMARY KEY,
    order_id           BIGINT         NOT NULL,
    idempotency_key    VARCHAR(100)   NOT NULL UNIQUE,   -- prevents duplicate payments
    amount             DECIMAL(12, 2) NOT NULL,
    status             VARCHAR(30)    NOT NULL,
    method             VARCHAR(30),
    provider_reference VARCHAR(100),
    failure_reason     VARCHAR(255),
    created_at         TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at         TIMESTAMP      NULL
);

CREATE INDEX idx_payments_order ON payments (order_id);
