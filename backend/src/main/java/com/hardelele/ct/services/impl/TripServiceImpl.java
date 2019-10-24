package com.hardelele.ct.services.impl;

import com.hardelele.ct.models.TripEntity;
import com.hardelele.ct.repositories.TripRepository;
import com.hardelele.ct.services.TripService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public TripEntity getOneById(Long id) throws NotFoundException {
        if (tripRepository.existsById(id)) {
            return tripRepository.getOne(id);
        } else {
            throw new NotFoundException("Not found entity with 'id':"+id);
        }
    }

    @Override
    public void add(String departure,
                    String destination,
                    long driverId,
                    long carId,
                    double driverPrice) {
        TripEntity tripToSave = new TripEntity(departure, destination, driverId, carId, driverPrice);
        tripRepository.save(tripToSave);
    }

    @Override
    public void update(long id,
                       String departure,
                       String destination,
                       long driverId,
                       long carId,
                       double driverPrice) throws NotFoundException {
        if (tripRepository.existsById(id)){
            TripEntity tripToUpdate = tripRepository.getOne(id);
        } else {
            throw new NotFoundException("Not found entity with 'id':"+id);
        }
    }

    @Override
    public void delete(long id) throws NotFoundException {
        if (tripRepository.existsById(id)){
            tripRepository.deleteById(id);
        } else {
            throw new NotFoundException("Not found entity with 'id':"+id);
        }
    }
}
