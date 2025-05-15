package com.pm.billingservice.service;

import com.pm.billingservice.dto.BillingRequestDTO;
import com.pm.billingservice.dto.BillingResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BillingService2Client {

    private final RestTemplate restTemplate;
    private final Logger log = LoggerFactory.getLogger(BillingService2Client.class);

    @Autowired
    public BillingService2Client(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public BillingResponseDTO createBillingAccount(BillingRequestDTO request) {
        log.info("Calling billing-service-2 to create billing account");

        String url = "http://billing-service-2/billing/createAccount"; // Logical service name via Eureka
        return restTemplate.postForObject(url, request, BillingResponseDTO.class);
    }
}
