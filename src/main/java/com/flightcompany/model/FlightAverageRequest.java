package com.flightcompany.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FlightAverageRequest {

    @ApiModelProperty(notes = "Flight Date From", example = "2022-04-30T00:00", required = true)
    private String dateFrom;

    @ApiModelProperty(notes = "Flight Date To", example = "2022-05-10T00:00", required = true)
    private String dateTo;

    @ApiModelProperty(notes = "Fly From", example = "OPO", required = true)
    private String flyFrom;

    @ApiModelProperty(notes = "Fly To", example = "LIS", required = true)
    private String flyTo;

}
