package com.hardelele.ct.controllers;

import com.hardelele.ct.entities.Car;
import com.hardelele.ct.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private CarRepository carRepository;

    @Autowired
    CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @RequestMapping(value = "/Cars", method = RequestMethod.GET)
    public List<Car> getAll(){
        return  carRepository.findAll();
    }


}
