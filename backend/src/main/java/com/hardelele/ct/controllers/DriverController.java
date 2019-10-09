package com.hardelele.ct.controllers;

import com.hardelele.ct.entities.Driver;
import com.hardelele.ct.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverController {

    private DriverRepository driverRepository;

    @Autowired
    DriverController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public List<Driver> getAll(){
        return  driverRepository.findAll();
    }


}
