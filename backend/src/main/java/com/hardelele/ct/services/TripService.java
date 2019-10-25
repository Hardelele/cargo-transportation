package com.hardelele.ct.services;

import com.hardelele.ct.models.TripEntity;
import javassist.NotFoundException;

import java.util.List;

public interface TripService {

    List<TripEntity> getAll();
    TripEntity getOneById(Long id) throws NotFoundException;
    void add(String departure,
             String destination,
             long driverId,
             long carId,
             double driverPrice,
             String startDate,
             String endDate);
    void update(long id,
                String departure,
                String destination,
                long driverId,
                long carId,
                double driverPrice,
                String startDate,
                String endDate) throws NotFoundException;
    void delete(long id) throws NotFoundException;
    void deleteAll();
}
