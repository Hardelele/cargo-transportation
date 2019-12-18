package com.hardelele.ct.services.impl;

import com.hardelele.ct.models.UserEntity;
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
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> getOne(long id) {
        return userRepository.findById(id);
    }

    @Override
    public UserEntity add(String login, String password, String firstName, String secondName, String role) {
        return null;
    }

    @Override
    public UserEntity update(long id, String login, String password, String firstName, String secondName, String role) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void deleteAll() {

    }
}
