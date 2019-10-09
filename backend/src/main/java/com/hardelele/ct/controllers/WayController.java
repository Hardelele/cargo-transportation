package com.hardelele.ct.controllers;

import com.hardelele.ct.entities.Way;
import com.hardelele.ct.repositories.WayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WayController {

    private WayRepository wayRepository;

    @Autowired
    WayController(WayRepository wayRepository) {
        this.wayRepository = wayRepository;
    }

    @RequestMapping(value = "/ways", method = RequestMethod.GET)
    public List<Way> getAll(){
        return  wayRepository.findAll();
    }

}
