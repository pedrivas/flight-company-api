package com.flightcompany.model.flightresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BagsPrice {
    @JsonProperty("1")
    public double _1;
    @JsonProperty("2")
    public double _2;
}
