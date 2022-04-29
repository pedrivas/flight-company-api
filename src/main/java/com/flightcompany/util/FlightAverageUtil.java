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

        FlightResponse flights = getFlightResponse(flightAverageRequest);
        List<ResponseData> flightsData = flights.getData();

        double averagePrice = getAveragePrice(flightsData);

        double firstBagAveragePrice = getFirstBagAveragePrice(flightsData);

        double secondBagAveragePrice = getSecondBagAveragePrice(flightsData);

        return FlightAverage.builder()
                .averagePrice(averagePrice)
                .firstBagAveragePrice(firstBagAveragePrice)
                .secondBagAveragePrice(secondBagAveragePrice)
                .currency(CURRENCY)
                .origin(flightAverageRequest.getFlyFrom())
                .destination(flightAverageRequest.getFlyTo())
                .build();

    }

    protected double getSecondBagAveragePrice(List<ResponseData> flightsData) {
        return flightsData.stream().mapToDouble(data -> data.getBagsPrice().getSecondBagPrice()).average().isPresent()
                ? flightsData.stream().mapToDouble(data -> data.getBagsPrice().getSecondBagPrice()).average().getAsDouble()
                : 0;
    }

    protected double getFirstBagAveragePrice(List<ResponseData> flightsData) {
        return flightsData.stream().mapToDouble(data -> data.getBagsPrice().getFirstBagPrice()).average().isPresent()
                ? flightsData.stream().mapToDouble(data -> data.getBagsPrice().getFirstBagPrice()).average().getAsDouble()
                : 0;
    }

    protected double getAveragePrice(List<ResponseData> flightsData) {
        return flightsData.stream().mapToDouble(ResponseData::getPrice).average().isPresent()
                ? flightsData.stream().mapToDouble(ResponseData::getPrice).average().getAsDouble()
                : 0;
    }

    protected FlightResponse getFlightResponse(FlightAverageRequest flightAverageRequest) {
        return skyPickerService.getFlights(flightAverageRequest);
    }


}
