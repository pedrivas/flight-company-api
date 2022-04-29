package com.flightcompany.web.skypicker.model.flightresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data
@Builder
public class ResponseData {
    private String id;
    private String flyFrom;
    private String flyTo;
    private String cityFrom;
    private String cityCodeFrom;
    private String cityTo;
    private String cityCodeTo;
    private CountryFrom countryFrom;
    private CountryTo countryTo;
    private int dTime;
    private int dTimeUTC;
    private int aTime;
    private int aTimeUTC;
    @JsonProperty("type_flights")
    private ArrayList<String> typeFlights;
    private Object nightsInDest;
    private double quality;
    private double distance;
    private Duration duration;
    private String flyDuration;
    private int price;
    private Conversion conversion;
    private Fare fare;
    @JsonProperty("price_dropdown")
    private PriceDropdown priceDropdown;
    @JsonProperty("bags_price")
    private BagsPrice bagsPrice;
    private BagLimit baglimit;
    private Availability availability;
    private ArrayList<ArrayList<String>> routes;
    private ArrayList<String> airlines;
    private ArrayList<Route> route;
    private String bookingToken;
    private String deepLink;
    private boolean facilitatedBookingAvailable;
    private int pnrCount;
    private boolean hasAirportChange;
    private int technicalStops;
    private boolean throwAwayTicketing;
    private boolean hiddenCityTicketing;
    private boolean virtualInterlining;
    private String mapIdfrom;
    private String mapIdto;
    private ArrayList<String> foundOn;
    private ArrayList<Object> transfers;
    private int p1;
    private int p2;
    private int p3;
}
