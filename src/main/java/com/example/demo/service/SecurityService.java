package com.example.demo.service;

/**
 * Created by indianic on 24/7/17.
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
