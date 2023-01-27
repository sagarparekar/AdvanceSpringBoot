package com.learn.dao;

import com.learn.entities.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployee();

    public Employee saveEmployee(Employee employee);

    public Employee upldateEmployee(Employee employee);

    public void deleteEmployeeById(long empId);


}
