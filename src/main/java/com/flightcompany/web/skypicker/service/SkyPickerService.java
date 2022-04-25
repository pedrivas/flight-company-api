package com.flightcompany.web.skypicker.service;

import com.flightcompany.web.skypicker.model.flightresponse.FlightResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class SkyPickerService {

    @Value("${skypicker.api.url}")
    private String baseUrl;

    private final RestTemplate restTemplate;

    public SkyPickerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public FlightResponse getFlights(){
        return null;
    }

}
