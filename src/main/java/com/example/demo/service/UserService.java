package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by indianic on 24/7/17.
 */
public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
