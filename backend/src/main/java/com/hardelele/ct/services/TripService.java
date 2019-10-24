package com.hardelele.ct.services;

import com.hardelele.ct.models.TripEntity;
import javassist.NotFoundException;

import java.util.Date;
import java.util.List;

public interface TripService {

    List<TripEntity> getAll();
    TripEntity getOneById(Long id) throws NotFoundException;
    void add(String departure,
             String destination,
             long driverId,
             long carId,
             double driverPrice,
             Date startDate,
             Date endDate);
    void update(long id,
                String departure,
                String destination,
                long driverId,
                long carId,
                double driverPrice,
                Date startDate,
                Date endDate) throws NotFoundException;
    void delete(long id) throws NotFoundException;
    void deleteAll();
}
