package com.flightcompany.model.flightresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Route {
    @JsonProperty("id")
    public String id;

    @JsonProperty("combination_id")
    public String combinationId;

    @JsonProperty("flyFrom")
    public String flyFrom;

    @JsonProperty("flyTo")
    public String flyTo;

    @JsonProperty("cityFrom")
    public String cityFrom;

    public String cityCodeFrom;
    public String cityTo;
    public String cityCodeTo;
    public int dTime;
    public int dTimeUTC;
    public int aTime;
    public int aTimeUTC;
    public String airline;
    public int flightNo;
    public String operatingCarrier;
    public String operatingFlightNo;
    public String fare_basis;
    public String fare_category;
    public String fare_classes;
    public String fare_family;
    @JsonProperty("return")
    public int myreturn;
    public double latFrom;
    public double lngFrom;
    public double latTo;
    public double lngTo;
    public String mapIdfrom;
    public String mapIdto;
    public boolean bags_recheck_required;
    public boolean vi_connection;
    public boolean guarantee;
    public int last_seen;
    public int refresh_timestamp;
    public Object equipment;
    public String vehicle_type;
    public int original_return;
    public String source;
    public String found_on;
    public int price;
}
