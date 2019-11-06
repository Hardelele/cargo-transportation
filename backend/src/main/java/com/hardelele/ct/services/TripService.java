package com.hardelele.ct.services;

import com.hardelele.ct.models.TripEntity;
import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

public interface TripService {

    List<TripEntity> getAll();
    Optional<TripEntity> getOneById(Long id);
    void add(String departure, String destination, long driverId, long carId, double driverPrice, String startDate, String endDate);
    void update(long id, String departure, String destination, long driverId, long carId, double driverPrice, String startDate, String endDate);
    void delete(long id) throws NotFoundException;
    void deleteAll();
}
