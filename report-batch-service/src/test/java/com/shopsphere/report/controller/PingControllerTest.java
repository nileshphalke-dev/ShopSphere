package com.shopsphere.report.controller;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class PingControllerTest {

    private final MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new PingController()).build();

    @Test
    void ping_returnsServiceName() throws Exception {
        mockMvc.perform(get("/api/reports/ping"))
                .andExpect(status().isOk())
                .andExpect(content().string("report-batch-service is up"));
    }
}
