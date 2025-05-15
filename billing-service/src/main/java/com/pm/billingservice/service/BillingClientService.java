package com.pm.billingservice.service;

import com.pm.billingservice.dto.BillingRequestDTO;
import com.pm.billingservice.dto.BillingResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BillingClientService {

    @Autowired
    private RestTemplate restTemplate;

    public BillingResponseDTO callBillingService2(BillingRequestDTO request) {
        return restTemplate.postForObject(
                "http://billing-service-2/billing/createAccount",
                request,
                BillingResponseDTO.class);
    }
}
