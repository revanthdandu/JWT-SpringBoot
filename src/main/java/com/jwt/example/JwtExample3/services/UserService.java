package com.jwt.example.JwtExample3.services;

import com.jwt.example.JwtExample3.entities.User;
import com.jwt.example.JwtExample3.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

   @Autowired
   private UserRepository userRepository;

   @Autowired
   private PasswordEncoder passwordEncoder;


    public List<User> getUsers(){
        return userRepository.findAll();
    }


    public User createUser(User user){

        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);

    }


}
