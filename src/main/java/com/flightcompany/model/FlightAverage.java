package com.flightcompany.model;

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
    private Long id;

    @Column(name = "origin", nullable = false)
    private String origin;

    @Column(name = "destination", nullable = false)
    private String destination;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "average_price", nullable = false)
    private double averagePrice;

    @Column(name = "first_bag_average_price", nullable = false)
    private double firstBagAveragePrice;

    @Column(name = "second_bag_average_price", nullable = false)
    private double secondBagAveragePrice;

}
