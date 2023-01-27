package com.employee.service;

import com.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public Employee saveEmployee(Employee employee);

    public Employee upldateEmployee(Employee employee);

    public void deleteEmployeeById(long empId);
}
