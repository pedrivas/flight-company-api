package com.flightcompany.web.skypicker.model.flightresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BagsPrice {
    @JsonProperty("1")
    private double firstBagPrice;
    @JsonProperty("2")
    private double secondBagPrice;
}
