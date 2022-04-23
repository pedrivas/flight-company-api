package com.flightcompany.model.flightresponse;

import lombok.Data;

import java.util.ArrayList;

@Data
public class FlightResponse {

    public String search_id;
    public int time;
    public String currency;
    public int fx_rate;
    public ArrayList<ResponseData> data;
    public SearchParams search_params;
    public ArrayList<Object> all_airlines;
    public ArrayList<Object> all_stopover_airports;
    public int del;
    public int currency_rate;
    public ArrayList<Object> connections;
    public ArrayList<Object> refresh;
    public ArrayList<Object> ref_tasks;
    public int sort_version;

}

