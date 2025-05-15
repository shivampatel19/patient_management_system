package com.pm.billingservice.controller;

import com.pm.billingservice.dto.BillingRequestDTO;
import com.pm.billingservice.dto.BillingResponseDTO;
import com.pm.billingservice.service.BillingClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billing")
public class HttpBillingController {

    private static final Logger log = LoggerFactory.getLogger(HttpBillingController.class);
    private final BillingClientService billingClientService;

    public HttpBillingController(BillingClientService billingClientService) {
        this.billingClientService = billingClientService;
    }

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

    @PostMapping("/callBillingService2")
    public BillingResponseDTO callBillingService2(@RequestBody BillingRequestDTO request) {
        log.info("Calling billing-service-2 from billing-service");
        BillingResponseDTO response = billingClientService.callBillingService2(request);
        log.info("Received response from billing-service-2: {}", response);
        return response;
    }

}
