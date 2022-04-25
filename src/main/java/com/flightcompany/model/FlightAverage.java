package com.flightcompany.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "flight_average")
public class FlightAverage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="airport_name", nullable = false)
    private String airportName;

    @Column(name="currency", nullable = false)
    private String currency;

    @Column(name="priceAverage", nullable = false)
    private double priceAverage;

    @Column(name="firstBagAveragePrice", nullable = false)
    private double firstBagAveragePrice;

    @Column(name="secondBagAveragePrice", nullable = false)
    private double secondBagAveragePrice;

}
