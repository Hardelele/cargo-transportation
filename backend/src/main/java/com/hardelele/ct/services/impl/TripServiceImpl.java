package com.hardelele.ct.services.impl;

import com.hardelele.ct.models.TripModel;
import com.hardelele.ct.repositories.TripRepository;
import com.hardelele.ct.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TripServiceImpl implements TripService {

    private final TripRepository tripRepository;

    @Autowired
    public TripServiceImpl(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @Override
    public List<TripModel> getAll() {
        return tripRepository.findAll();
    }

    @Override
    public Optional<TripModel> getOneById(Long id) {
            return tripRepository.findById(id);
    }

    @Override
    public TripModel add(String departure, String destination, int driverId, int carId, double driverPrice, String startDate, String endDate) {
        TripModel newTrip = new TripModel(departure, destination, driverId, carId, driverPrice, startDate, endDate);
        tripRepository.save(newTrip);
        return newTrip;
    }

    @Override
    public TripModel update(long id, String departure, String destination, int driverId, int carId, double driverPrice, String startDate, String endDate) {
        Optional<TripModel> updatedTrip;
        if (tripRepository.existsById(id)) {
            updatedTrip = tripRepository.findById(id);
            updatedTrip.get().setDeparture(departure);
            updatedTrip.get().setDestination(destination);
            updatedTrip.get().setDriverId(driverId);
            updatedTrip.get().setCarId(carId);
            updatedTrip.get().setDriverPrice(driverPrice);
            updatedTrip.get().setStartDate(startDate);
            updatedTrip.get().setEndDate(endDate);
            tripRepository.save(updatedTrip.get());
            return updatedTrip.get();
        } else {
            TripModel newTrip = this.add(departure, destination, driverId, carId, driverPrice, startDate, endDate);
            return newTrip;
        }
    }

    @Override
    public void delete(long id) {
        tripRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        tripRepository.deleteAll();
    }
}
