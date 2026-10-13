CREATE TABLE categories (
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(100) NOT NULL UNIQUE,
    description VARCHAR(500),
    created_at  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP    NULL
);

CREATE TABLE products (
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    sku         VARCHAR(50)    NOT NULL UNIQUE,
    name        VARCHAR(200)   NOT NULL,
    description TEXT,
    price       DECIMAL(12, 2) NOT NULL,
    image_url   VARCHAR(500),
    category_id BIGINT         NOT NULL,
    deleted     BOOLEAN        NOT NULL DEFAULT FALSE,
    created_at  TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP      NULL,
    CONSTRAINT fk_products_category FOREIGN KEY (category_id) REFERENCES categories (id)
);

CREATE INDEX idx_products_category ON products (category_id);
CREATE INDEX idx_products_name ON products (name);
