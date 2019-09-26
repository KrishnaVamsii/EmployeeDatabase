package com.wipro.EmployeeDatabase;

import com.wipro.EmployeeDatabase.Repository.EmployeeAddressRepository;
import com.wipro.EmployeeDatabase.Repository.EmployeeRepository;
import com.wipro.EmployeeDatabase.model.Employee;
import com.wipro.EmployeeDatabase.model.EmployeeAddress;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@RequiredArgsConstructor
@SpringBootApplication
public class EmployeeDatabaseApplication {
//    @Autowired
//    EmployeeAddressRepository employeeAddressRepository;

    public static void main(String[] args) {
		SpringApplication.run(EmployeeDatabaseApplication.class, args);
	}
}
