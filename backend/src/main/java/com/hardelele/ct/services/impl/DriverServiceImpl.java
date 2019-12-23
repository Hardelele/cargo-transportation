package com.hardelele.ct.services.impl;

import com.hardelele.ct.models.DriverModel;
import com.hardelele.ct.repositories.DriverRepository;
import com.hardelele.ct.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

    private final DriverRepository driverRepository;

    @Autowired
    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public List<DriverModel> getAll() {
        return driverRepository.findAll();
    }

    @Override
    public Optional<DriverModel> getDriverById(int id) {
        return driverRepository.findById(id);
    }

    @Override
    public DriverModel add(String firstName, String secondName, String patronymicName, String nationality, long passportSeries, long passportNumber, String birth, String passportScanUrl) {
        DriverModel newDriver = new DriverModel(firstName,secondName,patronymicName,nationality,passportSeries,passportNumber,birth,passportScanUrl);
        driverRepository.save(newDriver);
        return newDriver;
    }

    @Override
    public DriverModel update(int id, String firstName, String secondName, String patronymicName, String nationality, long passportSeries, long passportNumber, String birth, String passportScanUrl) {
        Optional<DriverModel> updatedDriver;
        if (driverRepository.existsById(id)) {
            updatedDriver = driverRepository.findById(id);
            updatedDriver.get().setFirstName(firstName);
            updatedDriver.get().setSecondName(secondName);
            updatedDriver.get().setPatronymicName(patronymicName);
            updatedDriver.get().setNationality(nationality);
            updatedDriver.get().setPassportSeries(passportSeries);
            updatedDriver.get().setPassportNumber(passportNumber);
            updatedDriver.get().setBirth(birth);
            updatedDriver.get().setPassportScanUrl(passportScanUrl);
            driverRepository.save(updatedDriver.get());
            return updatedDriver.get();
        } else {
            DriverModel newDriver = this.add(firstName, secondName, patronymicName, nationality, passportSeries, passportNumber, birth, passportScanUrl);
            return newDriver;
        }
    }

    @Override
    public void delete(int id) {
        driverRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        driverRepository.deleteAll();
    }
}
