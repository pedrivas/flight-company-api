package com.flightcompany.model;

import lombok.Data;

@Data
public class FlightAverageRequest {

    private String dateFrom;
    private String dateTo;
    private String flyFrom;
    private String flyTo;

}
