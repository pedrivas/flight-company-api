package com.flightcompany.web.skypicker.model.flightresponse;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ResponseData {
    public String id;
    public String flyFrom;
    public String flyTo;
    public String cityFrom;
    public String cityCodeFrom;
    public String cityTo;
    public String cityCodeTo;
    public CountryFrom countryFrom;
    public CountryTo countryTo;
    public int dTime;
    public int dTimeUTC;
    public int aTime;
    public int aTimeUTC;
    public ArrayList<String> type_flights;
    public Object nightsInDest;
    public double quality;
    public double distance;
    public Duration duration;
    public String flyDuration;
    public int price;
    public Conversion conversion;
    public Fare fare;
    public PriceDropdown priceDropdown;
    public BagsPrice bagsPrice;
    public BagLimit baglimit;
    public Availability availability;
    public ArrayList<ArrayList<String>> routes;
    public ArrayList<String> airlines;
    public ArrayList<Route> route;
    public String bookingToken;
    public String deepLink;
    public boolean facilitatedBookingAvailable;
    public int pnrCount;
    public boolean hasAirportChange;
    public int technicalStops;
    public boolean throwAwayTicketing;
    public boolean hiddenCityTicketing;
    public boolean virtualInterlining;
    public String mapIdfrom;
    public String mapIdto;
    public ArrayList<String> foundOn;
    public ArrayList<Object> transfers;
    public int p1;
    public int p2;
    public int p3;
}
