package com.hrm.service;

import com.hrm.dao.EmployeeDaoImpl;
import com.hrm.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;


    public Employee signUp(Employee employee) {
        return employeeDaoImpl.signUp(employee);
    }

    public boolean signIn(String empEmailId, String empPassword) {
        return employeeDaoImpl.signIn(empEmailId, empPassword);
    }

    public List<Employee> saveAllData(List<Employee> employees) {
        return employeeDaoImpl.saveAllData(employees);
    }

    // Optional is used to handle null pointer exception which is jdk1.8 feature
    public Optional<Employee> getDataById(int empId) {
        return employeeDaoImpl.getDataById(empId);
    }

    public List<Employee> getAllData() {
        return employeeDaoImpl.getAllData();
    }

    public List<Employee> getDataByAnyInput(Employee employee) {

        return employeeDaoImpl.getDataByAnyInput(employee);
    }

    public List<Employee> getDataByFirstName(String empFirstName) {
        return employeeDaoImpl.getDataByFirstName(empFirstName);
    }


    public List<Employee> sortByName() {
        return employeeDaoImpl.sortByName();
    }


    public List<Employee> filterDataBySalary(double empSalary) {
        return employeeDaoImpl.filterDataBySalary(empSalary);
    }

    public Employee updateData(Employee employee) {
        return employeeDaoImpl.updateData(employee);
    }


    public void deleteDataById(int empId) {
        employeeDaoImpl.deleteDataById(empId);
    }

    public void deleteAllData() {
        employeeDaoImpl.deleteAllData();
    }

}
