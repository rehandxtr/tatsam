package com.tatsam.priority.controller;

import com.tatsam.priority.model.UserModel;
import com.tatsam.priority.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping()
    public ResponseEntity<List<UserModel>> getUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> saveUser(@RequestBody UserModel user) {
     userRepository.save(user);
     return new ResponseEntity<>("User saved success", HttpStatus.OK);
    }

}
