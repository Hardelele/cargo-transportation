package com.hardelele.ct.services;

import com.hardelele.ct.models.TripModel;

import java.util.List;
import java.util.Optional;

public interface TripService {

    List<TripModel> getAll();
    Optional<TripModel> getOneById(Long id);
    TripModel add(String departure, String destination, int driverId, int carId, double driverPrice, String startDate, String endDate);
    TripModel update(long id, String departure, String destination, int driverId, int carId, double driverPrice, String startDate, String endDate);
    void delete(long id);
    void deleteAll();
}
