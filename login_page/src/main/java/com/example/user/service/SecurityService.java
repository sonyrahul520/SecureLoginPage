package com.example.user.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}