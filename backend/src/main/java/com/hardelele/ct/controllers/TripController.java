package com.hardelele.ct.controllers;

import com.hardelele.ct.models.TripEntity;
import com.hardelele.ct.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(value = "/trips/{id}")
    public Optional<TripEntity> getOne(@PathVariable Long id) {
        return tripService.getOneById(id);
    }

    @DeleteMapping(value = "/trips/delete/{id}")
    public void deleteOne(@RequestParam Long id) {
        tripService.delete(id);
    }

    @DeleteMapping(value = "/trips/delete")
    public void deleteAll() {
        tripService.deleteAll();
    }
}
