package com.example.TBlog.Controller;


import com.example.TBlog.Services.UsersServices;
import com.example.TBlog.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UsersServices usersServices;


    @GetMapping("/users")
    public List<Users> getAllUsers(){
        return usersServices.getAllUsers();
    }

    @PostMapping("/users")
    public ResponseEntity<?> createUsers(@RequestBody Users users){
        usersServices.createUsers(users);
        return ResponseEntity.status(HttpStatus.CREATED).body(users);
    }

    @GetMapping("/users/{id}")
    Users findUsersByID(@PathVariable int id) {
        return usersServices.getUsersById(id);
    }
}
