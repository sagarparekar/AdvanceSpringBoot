package com.cts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayHello(){
        return "Welcome to spring security ";
    }

    @GetMapping("/address")
    public String sayAddress(){
        return "Pune | MH | India";
    }

    @GetMapping("/Services")
    public String sayServices(){
        return "Software";
    }


    public Principal getUserDetails(Principal principal){
        // Principle is a interface which comes from spring security itself
        return principal;
    }
}
