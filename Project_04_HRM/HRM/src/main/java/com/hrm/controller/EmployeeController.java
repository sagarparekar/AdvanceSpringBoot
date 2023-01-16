package com.hrm.controller;

import com.hrm.exception.RecordNotFoundException;
import com.hrm.model.Employee;
import com.hrm.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/signup")
    public ResponseEntity<Employee> signUp(@Valid @RequestBody Employee employee) {
        log.info("**********TRYING TO SAVE DATA : "+employee.getEmpFirstName());
        Employee employee1 = employeeServiceImpl.signUp(employee);
        return new ResponseEntity<Employee>(employee1, HttpStatus.CREATED);
    }

    @PostMapping("/savealldata")
    public ResponseEntity<List<Employee>> saveAllData(@Valid @RequestBody List<Employee> employees) {
        return new ResponseEntity<>(employeeServiceImpl.saveAllData(employees), HttpStatus.CREATED);
    }

    @GetMapping("/signin/{empEmailId}/{empPassword}")
    public ResponseEntity<Boolean> signIn(@PathVariable String empEmailId, @PathVariable String empPassword) {
        return ResponseEntity.ok(employeeServiceImpl.signIn(empEmailId, empPassword));
    }

    @GetMapping("/getdatabyid/{empId}")
    public ResponseEntity<Optional<Employee>> getDataById(@PathVariable int empId) {
        return ResponseEntity.ok(employeeServiceImpl.getDataById(empId));
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData() {
        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }

    @PostMapping("/getdatabyanyinput")
    public ResponseEntity<List<Employee>> getDataByAnyInput(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeServiceImpl.getDataByAnyInput(employee));
    }

    @GetMapping("/getdatabyname/{empFirstName}")
    public ResponseEntity<List<Employee>> getDataByName(@PathVariable String empFirstName) {
        return ResponseEntity.ok(employeeServiceImpl.getDataByFirstName(empFirstName));
    }

    @GetMapping("/sortbyname")
    public ResponseEntity<List<Employee>> sortByName() {
        return ResponseEntity.ok(employeeServiceImpl.sortByName());
    }

    @GetMapping("/filterbysalary/{empSalary}")
    public ResponseEntity<List<Employee>> filterBySalary(@PathVariable double empSalary) {
        return ResponseEntity.ok(employeeServiceImpl.filterDataBySalary(empSalary));
    }

    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<Employee> updateData(@PathVariable int empId, @RequestBody Employee employee) throws RecordNotFoundException {
        Employee employee1 = employeeServiceImpl.getDataById(empId).orElseThrow(() -> new RecordNotFoundException("Employee Id does not exist"));
        employee1.setEmpFirstName(employee.getEmpFirstName());
        employee1.setEmpLastName(employee.getEmpLastName());
        employee1.setEmpDOB(employee.getEmpDOB());
        employee1.setEmpAddress(employee.getEmpAddress());
        employee1.setEmpContactNumber(employee.getEmpContactNumber());
        employee1.setEmpSalary(employee.getEmpSalary());
        employee1.setEmpEmailId(employee.getEmpEmailId());
        employee1.setEmpPassword(employee.getEmpPassword());

        return ResponseEntity.ok(employeeServiceImpl.updateData(employee));
    }

    @DeleteMapping("/deletedatabyid/{empId}")
    public ResponseEntity<String> deleteDataById(@PathVariable int empId) {
        employeeServiceImpl.deleteDataById(empId);
        return ResponseEntity.ok("Data Deleted Successfully!!");
    }

    @DeleteMapping("/deletealldata")
    public ResponseEntity<String> deleteAllData() {
        employeeServiceImpl.deleteAllData();
        return ResponseEntity.ok("All Data Deleted Successfully!!");
    }
}
