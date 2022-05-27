package com.example.pruebaNTTDATA.service;

import com.example.pruebaNTTDATA.model.Task;
import com.example.pruebaNTTDATA.model.User;

import java.util.List;

public interface IUserService {
    public List<User> listAllUsers();
    public void saveUser(User user);
    public User findByIdUser(int id);
    public void deleteUser(int id);

}
