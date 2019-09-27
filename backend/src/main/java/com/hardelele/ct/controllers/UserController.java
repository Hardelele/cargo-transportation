package com.hardelele.ct.controllers;

import com.hardelele.ct.entities.User;
import com.hardelele.ct.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/Users", method = RequestMethod.GET)
    public List<User> getAll(){
        return  userRepository.findAll();
    }


}
