package com.flightcompany.web.skypicker.model.flightresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class FlightResponse {

    @JsonProperty("search_id")
    public String searchId;

    @JsonProperty("time")
    public int time;

    @JsonProperty("currency")
    public String currency;

    @JsonProperty("fx_rate")
    public int fxRate;

    @JsonProperty("data")
    public List<ResponseData> data;

    @JsonProperty("search_params")
    public SearchParams searchParams;

    @JsonProperty("all_airlines")
    public List<Object> allAirlines;

    @JsonProperty("all_stopover_airports")
    public List<Object> allStopoverAirports;

    @JsonProperty("del")
    public int del;

    @JsonProperty("currency_rate")
    public int currencyRate;

    @JsonProperty("connections")
    public List<Object> connections;

    @JsonProperty("refresh")
    public List<Object> refresh;

    @JsonProperty("ref_tasks")
    public List<Object> refTasks;

    @JsonProperty("sort_version")
    public int sortVersion;

}

