package com.hardelele.ct.services.impl;

import com.hardelele.ct.models.UserModel;
import com.hardelele.ct.repositories.UserRepository;
import com.hardelele.ct.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<UserModel> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserModel> getOne(long id) {
        return userRepository.findById(id);
    }

    @Override
    public UserModel add(String login, String password, String firstName, String secondName, String role) {
        return null;
    }

    @Override
    public UserModel update(long id, String login, String password, String firstName, String secondName, String role) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void deleteAll() {

    }
}
