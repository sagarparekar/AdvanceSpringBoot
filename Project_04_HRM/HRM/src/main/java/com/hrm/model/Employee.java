package com.hrm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "emp_first_name")
    private String empFirstName;

    @Column(name = "emp_last_name")
    private String empLastName;
    @Column(name = "emp_address")
    private String empAddress;
    @Column(name = "emp_salary")
    private double empSalary;
    @Column(name = "emp_contact_number", unique = true)
    private String empContactNumber;
    @Column(name = "emp_dob")
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "Asia/Kolkata")
    private Date empDOB;
    @Column(name = "emp_email_id")
    @Email(message = "Email must be valid like abc11@gmail.com")
    private String empEmailId;
    @Column(name = "emp_password")
    private String empPassword;

}
