CREATE TABLE inventory (
    id                 BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_id         BIGINT    NOT NULL UNIQUE,
    available_quantity INT       NOT NULL DEFAULT 0,
    reserved_quantity  INT       NOT NULL DEFAULT 0,
    version            BIGINT    NOT NULL DEFAULT 0,   -- optimistic locking (@Version)
    created_at         TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at         TIMESTAMP NULL
);
