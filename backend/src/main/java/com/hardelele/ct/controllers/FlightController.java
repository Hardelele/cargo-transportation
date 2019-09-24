package com.hardelele.ct.controllers;

import com.hardelele.ct.entities.Flight;
import com.hardelele.ct.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    private FlightRepository flightRepository;

    @Autowired
    FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public List<Flight> getAll(){
        return  flightRepository.findAll();
    }

}
