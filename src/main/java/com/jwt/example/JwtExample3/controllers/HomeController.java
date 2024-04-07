package com.jwt.example.JwtExample3.controllers;

import com.jwt.example.JwtExample3.entities.User;
import com.jwt.example.JwtExample3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> getUser(){

        System.out.println("getting users");

        return this.userService.getUsers();
    }


}
