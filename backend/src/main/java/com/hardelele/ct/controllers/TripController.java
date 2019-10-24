package com.hardelele.ct.controllers;

import com.hardelele.ct.models.TripEntity;
import com.hardelele.ct.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "tripController")
public class TripController {

    private final TripService tripService;

    @Autowired
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping(value = "/trips")
    public List<TripEntity> getAll() {
        return tripService.getAll();
    }
}