package com.hardelele.ct.services;

import com.hardelele.ct.models.DriverModel;

import java.util.List;
import java.util.Optional;

public interface DriverService {

    List<DriverModel> getAll();
    Optional<DriverModel> getDriverById(int id);
    DriverModel add(String firstName, String secondName, String patronymicName, String nationality, long passportSeries, long passportNumber, String birth, String passportScanUrl);
    DriverModel update(int id, String firstName, String secondName, String patronymicName, String nationality, long passportSeries, long passportNumber, String birth, String passportScanUrl);
    void delete(int id);
    void deleteAll();
}
