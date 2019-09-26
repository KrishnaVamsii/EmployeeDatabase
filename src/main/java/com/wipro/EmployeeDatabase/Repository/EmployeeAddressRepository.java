package com.wipro.EmployeeDatabase.Repository;

import com.wipro.EmployeeDatabase.model.Employee;
import com.wipro.EmployeeDatabase.model.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress,String>,CrudRepository<EmployeeAddress,String> {
    EmployeeAddress findByEmpId(String empId);

    List<EmployeeAddress> findAllByEmpId(String empId);
}
