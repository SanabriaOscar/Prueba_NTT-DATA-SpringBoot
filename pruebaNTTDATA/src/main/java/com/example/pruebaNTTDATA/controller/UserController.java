package com.example.pruebaNTTDATA.controller;

import com.example.pruebaNTTDATA.model.User;
import com.example.pruebaNTTDATA.service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }


    @GetMapping("/users")
    public List<User> listAllUserC(){
        return userService.listAllUsers();
    }
    @PostMapping("/users/add")
    public String saveUserC(@RequestBody User user){
        userService.saveUser(user);
        return "User saved sussesfull";
    }
    @GetMapping("/users/{id}")
    public User listUserByIdC(@PathVariable int id) {
        return userService.findByIdUser(id);
    }
    @PutMapping("/users/edit/{id}")
    public User updateUserByIdC(@PathVariable int id, @RequestBody User user) {
        User userUpdate=userService.findByIdUser(id);
        userUpdate.setName(user.getName());
        userUpdate.setLastName(user.getLastName());
        userUpdate.setAddress(user.getAddress());
        userUpdate.setPhoneNumber(user.getPhoneNumber());
        userUpdate.setTask(user.getTask());
        userService.saveUser(userUpdate);
        return userUpdate;
    }
    @DeleteMapping("/users/delete/{id}")
    public String deleteUserC(@PathVariable int id){
        userService.deleteUser(id);
        return "User deleted sussesfull";
    }
}
