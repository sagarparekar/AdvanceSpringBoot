package com.learn.controller;

import com.learn.entities.Employee;
import com.learn.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @GetMapping("/getAllEmployees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(employeeServiceImpl.getAllEmployee());
    }

    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployees(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeServiceImpl.saveEmployee(employee));
    }


}
