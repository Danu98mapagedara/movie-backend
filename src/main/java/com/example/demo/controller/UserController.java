package com.example.demo.controller;


import com.example.demo.modal.Movie;
import com.example.demo.modal.User;
import com.example.demo.service.MovieService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")

public class UserController {
    @Autowired
    private UserService userService;

  @GetMapping
    public List<User> getAllUsers(){ return  userService.getAllUsers();}

    @PostMapping
    public User AddUser (@RequestBody User user){

        return  userService.addUser(user);
    }

}
