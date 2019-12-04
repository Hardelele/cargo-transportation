package com.hardelele.ct.services;

import com.hardelele.ct.models.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserEntity> getAll();
    Optional<UserEntity> getOne(long id);
    UserEntity add(String login, String password, String firstName, String secondName, String role);
    UserEntity update(long id, String login, String password, String firstName, String secondName, String role);
    void delete(long id);
    void deleteAll();
}
