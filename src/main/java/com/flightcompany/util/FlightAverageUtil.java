package com.flightcompany.util;

import com.flightcompany.model.FlightAverage;
import com.flightcompany.model.FlightAverageRequest;
import com.flightcompany.web.skypicker.model.flightresponse.FlightResponse;
import com.flightcompany.web.skypicker.model.flightresponse.ResponseData;
import com.flightcompany.web.skypicker.service.SkyPickerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class FlightAverageUtil {

    private static final String CURRENCY = "EUR";

    SkyPickerService skyPickerService;

    public FlightAverage calculateFlightAverage(FlightAverageRequest flightAverageRequest) {

        FlightResponse flights = skyPickerService.getFlights(flightAverageRequest);
        List<ResponseData> flightsData = flights.getData();

        double averagePrice = flightsData.stream().mapToDouble(ResponseData::getPrice).average().isPresent()
                ? flightsData.stream().mapToDouble(ResponseData::getPrice).average().getAsDouble()
                : 0;

        double firstBagAveragePrice = flightsData.stream().mapToDouble(data -> data.getBagsPrice().get_1()).average().isPresent()
                ? flightsData.stream().mapToDouble(data -> data.getBagsPrice().get_1()).average().getAsDouble()
                : 0;

        double secondBagAveragePrice = flightsData.stream().mapToDouble(data -> data.getBagsPrice().get_2()).average().isPresent()
                ? flightsData.stream().mapToDouble(data -> data.getBagsPrice().get_2()).average().getAsDouble()
                : 0;

        return FlightAverage.builder()
                .averagePrice(averagePrice)
                .firstBagAveragePrice(firstBagAveragePrice)
                .secondBagAveragePrice(secondBagAveragePrice)
                .currency(CURRENCY)
                .origin(flightAverageRequest.getFlyFrom())
                .destination(flightAverageRequest.getFlyTo())
                .build();

    }


}
