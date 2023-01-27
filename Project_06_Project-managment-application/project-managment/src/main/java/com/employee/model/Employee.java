package com.employee.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long employeeId;

    @NotBlank(message = "*** Must required employee first name")
    @Size(min = 5, max = 20)
    private String firstName;

    @NotBlank(message = "*** Must required employee last name")
    @Size(min = 5, max = 20)
    private String lastName;

    @Email(message = "*** Email must be required pattern abc@xyz.com")
    @NotBlank
    private String email;

    public Employee(long employeeId, String firstName, String lastName, String email) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
