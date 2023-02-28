package com.schneider.auth.controller;


import com.schneider.auth.model.UserDTO;
import com.schneider.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO) {
        service.save(userDTO);
        return ResponseEntity.ok().body("User Created Successfully: \n" + "Username: " + userDTO.getUsername() + "\n" + "Password: " + userDTO.getPassword() +"\n"+ "Role: " + userDTO.getRole());
    }


}
