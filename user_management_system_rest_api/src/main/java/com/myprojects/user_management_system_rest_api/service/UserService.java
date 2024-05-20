package com.myprojects.user_management_system_rest_api.service;

import com.myprojects.user_management_system_rest_api.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(User user);
    User deleteUser(Long id);
}
