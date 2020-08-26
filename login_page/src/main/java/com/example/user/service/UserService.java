package com.example.user.service;

import com.example.user.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}