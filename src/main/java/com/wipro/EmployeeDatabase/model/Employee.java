package com.wipro.EmployeeDatabase.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Employee {
    @Id
    String id;
    String name;
    String designation;
    Double salary;
}

