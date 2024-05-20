package com.myprojects.user_management_system_rest_api.controller;

import com.myprojects.user_management_system_rest_api.entity.User;
import com.myprojects.user_management_system_rest_api.service.UserserviceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {
    private UserserviceImpl userServiceImpl;

    @GetMapping("start")
    public String welcome(){
        return "welcome to user management project";
    }
    @GetMapping("{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userServiceImpl.getUserById(id);
    }

    @GetMapping("/allusers")
    public List<User> getAllUsers(){
        return userServiceImpl.getAllUsers();
    }

    @PostMapping("create")
    public User createUser(@RequestBody User user){
        return userServiceImpl.createUser(user);
    }

    @PutMapping("update")
    public User updateUser(@RequestBody User user){
        return userServiceImpl.updateUser(user);
    }

    @DeleteMapping("delete")
    public User deleteUser(@PathVariable Long id){
        return userServiceImpl.deleteUser(id);
    }
}
