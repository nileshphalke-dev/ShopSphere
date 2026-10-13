package com.shopsphere.common.exception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.ProblemDetail;

import static org.assertj.core.api.Assertions.assertThat;

class GlobalExceptionHandlerTest {

    private final GlobalExceptionHandler handler = new GlobalExceptionHandler();

    @Test
    @DisplayName("ResourceNotFoundException maps to 404")
    void notFound_returns404() {
        ProblemDetail pd = handler.handleNotFound(new ResourceNotFoundException("Product", 5L));

        assertThat(pd.getStatus()).isEqualTo(404);
        assertThat(pd.getDetail()).isEqualTo("Product not found with id: 5");
    }

    @Test
    @DisplayName("BusinessException maps to 422")
    void business_returns422() {
        ProblemDetail pd = handler.handleBusiness(new BusinessException("Insufficient stock"));

        assertThat(pd.getStatus()).isEqualTo(422);
        assertThat(pd.getDetail()).isEqualTo("Insufficient stock");
    }

    @Test
    @DisplayName("Unknown exception maps to 500 without leaking the message")
    void generic_returns500() {
        ProblemDetail pd = handler.handleGeneric(new RuntimeException("secret internals"));

        assertThat(pd.getStatus()).isEqualTo(500);
        assertThat(pd.getDetail()).doesNotContain("secret");
    }
}
