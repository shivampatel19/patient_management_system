package com.pm.billingservice2.controller;

import com.pm.billingservice2.dto.BillingRequestDTO;
import com.pm.billingservice2.dto.BillingResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billing")
public class HttpBillingController {

    private static final Logger log = LoggerFactory.getLogger(HttpBillingController.class);

    @PostMapping("/createAccount")
    public BillingResponseDTO createBillingAccount(@RequestBody BillingRequestDTO request) {
        log.info("HTTP createBillingAccount request received: {}", request);

        // Just a dummy response for testing
        BillingResponseDTO response = new BillingResponseDTO();
        response.setAccountId("12345");
        response.setStatus("ACTIVE");

        log.info("HTTP createBillingAccount response sent: {}", response);
        return response;
    }
}
