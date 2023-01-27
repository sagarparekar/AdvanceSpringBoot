package com.project;

import com.employee.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan({"com.project.employee"})
@SpringBootApplication
public class ProjectManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagmentApplication.class, args);
	}

}
