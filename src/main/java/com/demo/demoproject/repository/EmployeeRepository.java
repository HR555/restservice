package com.demo.demoproject.repository;

import com.demo.demoproject.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository <-- not required since Implementation of JpaRepository has the annotation
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
