package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployees(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeServiceImpl.saveEmployee(employee));
    }


}
