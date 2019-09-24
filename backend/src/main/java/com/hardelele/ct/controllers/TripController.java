package com.hardelele.ct.controllers;

import com.hardelele.ct.entities.Trip;
import com.hardelele.ct.repositories.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TripController {

    private TripRepository tripRepository;

    @Autowired
    TripController(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public List<Trip> getAll(){
        return  tripRepository.findAll();
    }

}
