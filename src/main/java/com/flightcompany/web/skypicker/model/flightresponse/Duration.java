package com.flightcompany.web.skypicker.model.flightresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Duration {
    public int departure;
    @JsonProperty("return")
    public int myreturn;
    public int total;
}
