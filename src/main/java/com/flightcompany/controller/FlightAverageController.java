package com.flightcompany.controller;

import com.flightcompany.model.FlightAverage;
import com.flightcompany.model.FlightAverageRequest;
import com.flightcompany.repository.FlightAverageRepository;
import com.flightcompany.util.FlightAverageUtil;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class FlightAverageController {

    FlightAverageRepository flightAverageRepository;
    FlightAverageUtil flightAverageUtil;

    @ApiOperation(value = "Search all registers.")
    @GetMapping("/flight/avg")
    public List<FlightAverage> getAllFlightAverages() {
        return flightAverageRepository.findAll();
    }

    @ApiOperation(value = "Search a register by id.")
    @GetMapping("/flight/avg/{id}")
    public FlightAverage getFlightAverageById(@PathVariable Long id) {
        return flightAverageRepository.findById(id).orElse(null);
    }

    @ApiOperation(value = "Make a request to the skypicker API and return the average prices of the flight and bag transportation. The returned data is saved in the database.")
    @PostMapping("/flight/calculateAvgPrices")
    public FlightAverage saveCalculatedFlightAverage(@RequestBody FlightAverageRequest flightAverageRequest) {
        FlightAverage flightAverage = flightAverageUtil.calculateFlightAverage(flightAverageRequest);
        return flightAverageRepository.save(flightAverage);
    }

    @DeleteMapping("flight/avg/{id}")
    public void deleteFlightAverage(@PathVariable Long id) {
        flightAverageRepository.deleteById(id);
    }


}
