package com.hardelele.ct.controllers;

import com.hardelele.ct.dto.TripDto;
import com.hardelele.ct.models.TripModel;
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
    public List<TripModel> getAll() {
        return tripService.getAll();
    }

    @GetMapping(value = "/trips/{id}")
    public Optional<TripModel> getOne(@PathVariable Long id) {
        return tripService.getOneById(id);
    }

    @DeleteMapping(value = "/trips/delete/{id}")
    public void deleteOne(@PathVariable Long id) {
        tripService.delete(id);
    }

    @DeleteMapping(value = "/trips/delete")
    public void deleteAll() {
        tripService.deleteAll();
    }

    @PostMapping("/trips/add")
    public TripModel addTrip(@RequestBody TripDto tripDto) {
        return tripService.add(tripDto.getDeparture(), tripDto.getDestination(), tripDto.getDriverId(),
                tripDto.getCarId(), tripDto.getDriverPrice(), tripDto.getStartDate(), tripDto.getEndDate());
    }

    @PutMapping("/trips/update")
    public TripModel updateTrip(@PathVariable Long id, @RequestBody TripDto tripDto) {
        return tripService.update(id ,tripDto.getDeparture(), tripDto.getDestination(),
                tripDto.getDriverId(), tripDto.getCarId(), tripDto.getDriverPrice(),
                tripDto.getStartDate(), tripDto.getEndDate());
    }
}