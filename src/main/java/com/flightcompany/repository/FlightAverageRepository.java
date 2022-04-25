package com.flightcompany.repository;

import com.flightcompany.model.FlightAverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightAverageRepository extends JpaRepository<FlightAverage, Long> {

}
