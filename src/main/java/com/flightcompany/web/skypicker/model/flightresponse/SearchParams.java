package com.flightcompany.web.skypicker.model.flightresponse;

import lombok.Data;

@Data
public class SearchParams {
    public String flyFrom_type;
    public String to_type;
    public Seats seats;
}
