package com.flightcompany.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "flight_average")
@Builder
public class FlightAverage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Register ID", example = "1", required = true)
    private Long id;

    @Column(name = "origin", nullable = false)
    @ApiModelProperty(notes = "Flight Origin", example = "OPO", required = true)
    private String origin;

    @Column(name = "destination", nullable = false)
    @ApiModelProperty(notes = "Flight Destination", example = "LIS", required = true)
    private String destination;

    @Column(name = "currency", nullable = false)
    @ApiModelProperty(notes = "Currency", example = "EUR", required = true)
    private String currency;

    @Column(name = "average_price", nullable = false)
    @ApiModelProperty(notes = "Flight Average Price", example = "50.15", required = true)
    private double averagePrice;

    @Column(name = "first_bag_average_price", nullable = false)
    @ApiModelProperty(notes = "Single Bag Average Price", example = "50.15", required = true)
    private double firstBagAveragePrice;

    @Column(name = "second_bag_average_price", nullable = false)
    @ApiModelProperty(notes = "Second Bag Average Price", example = "50.15", required = true)
    private double secondBagAveragePrice;

}
