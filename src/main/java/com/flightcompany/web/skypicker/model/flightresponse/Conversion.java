package com.flightcompany.web.skypicker.model.flightresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Conversion {
    @JsonProperty("EUR")
    public int eUR;
}
