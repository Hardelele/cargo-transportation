package com.hardelele.ct.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.ResponseWrapper;

@RestController
public class HomeController {

    @RequestMapping("/home")
    @ResponseBody
    String home1(){
        return "Домашняя страница";
    }

    @RequestMapping("/")
    @ResponseBody
    String home2(){
        return "Домашняя страница";
    }

}
