package com.myprojects.user_management_system_rest_api.service;

import com.myprojects.user_management_system_rest_api.entity.User;
import com.myprojects.user_management_system_rest_api.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserserviceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existingUser=userRepository.findById(user.getUserId()).get();
        existingUser.setUserName(user.getUserName());
        existingUser.setUserEmail(user.getUserEmail());
        existingUser.setUserAge(user.getUserAge());
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(Long id) {
        User wantToDelete=userRepository.findById(id).get();
        userRepository.deleteById(id);
        return wantToDelete;
    }


}
