package com.flightcompany.controller;

import com.flightcompany.model.FlightAverage;
import com.flightcompany.repository.FlightAverageRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class FlightAverageController {

    FlightAverageRepository flightAverageRepository;

    @GetMapping("/flight/avg")
    public List<FlightAverage> getAllFlightAverages(){
        return flightAverageRepository.findAll();
    }

    @GetMapping("/flight/avg/{id}")
    public FlightAverage getFlightAverageById(@PathVariable Long id){
        return flightAverageRepository.findById(id).orElse(null);
    }

    @PostMapping("/flight/avg")
    public FlightAverage saveFlightAverage(@RequestBody FlightAverage flightAverage){
        return flightAverageRepository.save(flightAverage);
    }

    @DeleteMapping("flight/avg/{id}")
    public void deleteFlightAverage(@PathVariable Long id){
        flightAverageRepository.deleteById(id);
    }

}
