package com.hardelele.ct.services;

import com.hardelele.ct.models.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserModel> getAll();
    Optional<UserModel> getOne(long id);
    UserModel add(String login, String password, String firstName, String secondName, String role);
    UserModel update(long id, String login, String password, String firstName, String secondName, String role);
    void delete(long id);
    void deleteAll();
}
