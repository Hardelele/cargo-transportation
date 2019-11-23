package com.hardelele.ct.services;

import com.hardelele.ct.models.TripEntity;

import java.util.List;
import java.util.Optional;

public interface TripService {

    List<TripEntity> getAll();
    Optional<TripEntity> getOneById(Long id);
    void add(String departure, String destination, int driverId, int carId, double driverPrice, String startDate, String endDate);
    void update(long id, String departure, String destination, int driverId, int carId, double driverPrice, String startDate, String endDate);
    void delete(long id);
    void deleteAll();
}
