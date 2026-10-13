package com.shopsphere.common.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ApiResponseTest {

    @Test
    void ok_wrapsData() {
        ApiResponse<String> res = ApiResponse.ok("hello");

        assertThat(res.success()).isTrue();
        assertThat(res.data()).isEqualTo("hello");
        assertThat(res.timestamp()).isNotNull();
    }

    @Test
    void error_hasNoData() {
        ApiResponse<Object> res = ApiResponse.error("boom");

        assertThat(res.success()).isFalse();
        assertThat(res.message()).isEqualTo("boom");
        assertThat(res.data()).isNull();
    }
}
