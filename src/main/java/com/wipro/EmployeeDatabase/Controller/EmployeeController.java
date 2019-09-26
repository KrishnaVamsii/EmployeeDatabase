package com.wipro.EmployeeDatabase.Controller;

import com.wipro.EmployeeDatabase.Repository.EmployeeAddressRepository;
import com.wipro.EmployeeDatabase.Repository.EmployeeRepository;
import com.wipro.EmployeeDatabase.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeAddressRepository employeeAddressRepository;
    @GetMapping("/getByID/{id}")
    Employee getDetails( @PathVariable String id){
       return employeeRepository.findById(id).get();
    }

    @GetMapping("getAllEmployees")
    List<Employee> getAllEmployees(){
      return employeeRepository.findAll();
    }

    @PostMapping("createEmployee")
    public void createEmployee(@RequestBody Employee employee)
    {
        employeeRepository.save(employee);
    }
    @PutMapping("/updateEmployee")
    public void updateEmployee(@RequestBody Employee employee)
    {
//        Optional<Employee> employee1 =employeeRepository.findById(id);
        employeeRepository.save(employee);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable String id){
        employeeRepository.deleteById(id);
    }

    @GetMapping("/getEmployeeAddress/{id}")
    public String getEmployeeAddress(@PathVariable String id){
        return employeeRepository.findById(id).get().toString()+"  "+
                employeeAddressRepository.findAllByEmpId(id).toString();

    }
}
