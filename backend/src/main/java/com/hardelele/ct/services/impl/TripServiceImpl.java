package com.hardelele.ct.services.impl;

import com.hardelele.ct.models.TripEntity;
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
    public List<TripEntity> getAll() {
        return tripRepository.findAll();
    }

    @Override
    public Optional<TripEntity> getOneById(Long id) {
            return tripRepository.findById(id);
    }

    @Override
    public TripEntity add(String departure, String destination, int driverId, int carId, double driverPrice, String startDate, String endDate) {
        TripEntity tripToSave = new TripEntity(departure, destination, driverId, carId, driverPrice, startDate, endDate);
        tripRepository.save(tripToSave);
        return tripToSave;
    }

    @Override
    public TripEntity update(long id, String departure, String destination, int driverId, int carId, double driverPrice, String startDate, String endDate) {
        Optional<TripEntity> newTripEntity;
        if (tripRepository.existsById(id)) {
            newTripEntity = tripRepository.findById(id);
            newTripEntity.get().setDeparture(departure);
            newTripEntity.get().setDestination(destination);
            newTripEntity.get().setDriverId(driverId);
            newTripEntity.get().setCarId(carId);
            newTripEntity.get().setDriverPrice(driverPrice);
            newTripEntity.get().setStartDate(startDate);
            newTripEntity.get().setEndDate(endDate);
            tripRepository.save(newTripEntity.get());
            return newTripEntity.get();
        } else {
            TripEntity tripToSave = this.add(departure, destination, driverId, carId, driverPrice, startDate, endDate);
            return tripToSave;
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
