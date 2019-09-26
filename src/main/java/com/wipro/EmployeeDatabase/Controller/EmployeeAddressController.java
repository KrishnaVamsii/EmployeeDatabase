package com.wipro.EmployeeDatabase.Controller;

import com.wipro.EmployeeDatabase.Repository.EmployeeAddressRepository;
import com.wipro.EmployeeDatabase.Repository.EmployeeRepository;
import com.wipro.EmployeeDatabase.model.Employee;
import com.wipro.EmployeeDatabase.model.EmployeeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeAddressController {
    @Autowired
    EmployeeAddressRepository employeeAddressRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/getAddressById/{addressId}")
    public EmployeeAddress getAddressById(@PathVariable String addressId){
        return employeeAddressRepository.findById(addressId).get();
    }

    @GetMapping("getAllAddress")
    public List<EmployeeAddress> getAllAddress(){
        return employeeAddressRepository.findAll();
    }

    @PostMapping("/createAddress")
   public void createAddress(@RequestBody EmployeeAddress employeeAddress){
        employeeAddressRepository.save(employeeAddress);
    }

    @PutMapping("/updateEmployeeAddress")
    public void updateEmployeeAddress(@RequestBody EmployeeAddress employeeAddress)
    {
        employeeAddressRepository.save(employeeAddress);
    }

    @DeleteMapping("/deleteEmployeeAddress/{addressId}")
    public void deleteEmployeeAddress(@PathVariable String addressId){
        employeeAddressRepository.deleteById(addressId);
    }

    @GetMapping("/getEmployeeByAddressID/{addressId}")
    public String getEmployeeByAddressID(@PathVariable String addressId){
        return employeeAddressRepository.findById(addressId).get().toString()+" "+
               employeeRepository.findById(employeeAddressRepository.findById(addressId).get().getEmpId()).get().toString();
    }
}
