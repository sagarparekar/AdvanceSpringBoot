package com.schneider.controller;

import com.schneider.model.User;
import com.schneider.model.UserDTO;
import com.schneider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO) {
        service.save(userDTO);
        return ResponseEntity.ok().body("User Created Successfully: \n" + "Username: " + userDTO.getUsername() + "\n" + "Password: " + userDTO.getPassword() + "Role: " + userDTO.getRole());
    }
}
