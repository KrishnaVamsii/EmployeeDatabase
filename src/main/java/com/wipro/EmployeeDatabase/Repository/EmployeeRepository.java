package com.wipro.EmployeeDatabase.Repository;

import com.wipro.EmployeeDatabase.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String>,CrudRepository<Employee,String>{
}
