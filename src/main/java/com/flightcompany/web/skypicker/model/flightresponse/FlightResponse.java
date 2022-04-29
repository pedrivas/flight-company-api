package com.flightcompany.web.skypicker.model.flightresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FlightResponse {

    @JsonProperty("search_id")
    private String searchId;

    @JsonProperty("time")
    private int time;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("fx_rate")
    private int fxRate;

    @JsonProperty("data")
    private List<ResponseData> data;

    @JsonProperty("search_params")
    private SearchParams searchParams;

    @JsonProperty("all_airlines")
    private List<Object> allAirlines;

    @JsonProperty("all_stopover_airports")
    private List<Object> allStopoverAirports;

    @JsonProperty("del")
    private int del;

    @JsonProperty("currency_rate")
    private int currencyRate;

    @JsonProperty("connections")
    private List<Object> connections;

    @JsonProperty("refresh")
    private List<Object> refresh;

    @JsonProperty("ref_tasks")
    private List<Object> refTasks;

    @JsonProperty("sort_version")
    private int sortVersion;

}

