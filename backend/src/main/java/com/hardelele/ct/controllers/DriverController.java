package com.hardelele.ct.controllers;

import com.hardelele.ct.dto.DriverDto;
import com.hardelele.ct.models.DriverModel;
import com.hardelele.ct.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController(value = "driverController")
public class DriverController {
    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping(value = "/drivers")
    public List<DriverModel> getAll() {
        return driverService.getAll();
    }

    @GetMapping(value = "/drivers/{id}")
    public Optional<DriverModel> getOne(@PathVariable int id) {
        return driverService.getDriverById(id);
    }

    @DeleteMapping(value = "/drivers/{id}")
    public void deleteOne(@PathVariable int id) {
        driverService.delete(id);
    }

    @DeleteMapping(value = "/drivers/clean")
    public void deleteAll() {
        driverService.deleteAll();
    }

    @PostMapping("/drivers")
    public DriverModel addTrip(@RequestBody DriverDto driverDto) {
        return driverService.add(driverDto.getFirstName(),driverDto.getSecondName(),driverDto.getPatronymicName(),
                driverDto.getNationality(),driverDto.getPassportSeries(), driverDto.getPassportNumber(),
                driverDto.getBirth(),driverDto.getPassportScanUrl());
    }

    @PutMapping("/drivers")
    public DriverModel updateTrip(@PathVariable int id, @RequestBody DriverDto driverDto) {
        return driverService.update(id, driverDto.getFirstName(), driverDto.getSecondName(),
                driverDto.getPatronymicName(), driverDto.getNationality(), driverDto.getPassportSeries(),
                driverDto.getPassportNumber(), driverDto.getBirth(),driverDto.getPassportScanUrl());
    }
}
