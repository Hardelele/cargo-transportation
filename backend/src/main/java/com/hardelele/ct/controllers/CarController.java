package com.hardelele.ct.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @RequestMapping(value = "/cars")
    @ResponseBody
    String cars(){
        return "cars";
    }

}
