package com.flightcompany.web.skypicker.service;

import com.flightcompany.model.FlightAverageRequest;
import com.flightcompany.web.skypicker.model.flightresponse.FlightResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@Slf4j
public class SkyPickerService {

    @Value("${skypicker.api.url}")
    private String baseUrl;

    @Autowired
    RestTemplate restTemplate;

    public FlightResponse getFlights(FlightAverageRequest flightAverageRequest) {

        String url = baseUrl + "/flights";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("fly_from", flightAverageRequest.getFlyFrom())
                .queryParam("fly_to", flightAverageRequest.getFlyTo())
                .queryParam("depart_after", flightAverageRequest.getDateFrom())
                .queryParam("depart_before", flightAverageRequest.getDateTo())
                .queryParam("partner", "drivasdrivas");

        return restTemplate.getForObject(uriComponentsBuilder.toUriString(), FlightResponse.class);

    }

}



