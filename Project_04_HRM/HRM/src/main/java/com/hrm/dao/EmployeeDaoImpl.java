package com.hrm.dao;

import com.hrm.model.Employee;
import com.hrm.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepository employeeRepositoryImpl;

    public Employee signUp(Employee employee) {
        return employeeRepositoryImpl.save(employee);
    }

    public boolean signIn(String empEmailId, String empPassword) {
        boolean flag = false;

        for (Employee employee : employeeRepositoryImpl.findAll()) {
            if (employee.getEmpEmailId().equals(empEmailId) && employee.getEmpPassword().equals(empPassword)) {
                flag = true;
            }
        }

        return flag;
    }

    public List<Employee> saveAllData(List<Employee> employees) {
        return employeeRepositoryImpl.saveAll(employees);
    }

    public Optional<Employee> getDataById(int empId) {
        return employeeRepositoryImpl.findById(empId);
    }


}
