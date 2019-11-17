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
    public void add(String departure, String destination, long driverId, long carId, double driverPrice, String startDate, String endDate) {
        TripEntity tripToSave = new TripEntity(departure, destination, driverId, carId, driverPrice, startDate, endDate);
        tripRepository.save(tripToSave);
    }

    @Override
    public void update(long id, String departure, String destination, long driverId, long carId, double driverPrice, String startDate, String endDate) {
        TripEntity tripToUpdate = tripRepository.getOne(id);
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
