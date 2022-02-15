package com.demo.demoproject.controller;

import com.demo.demoproject.model.Employee;
import com.demo.demoproject.service.EmployeeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    // http://localhost:8080/employees/create
    @PostMapping(value = "/employees/create")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    // http://localhost:8080/employees/3
    @GetMapping(value ="/employees/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable long id){
        return new ResponseEntity<>(employeeService.getEmployee(id), HttpStatus.OK);
    }

}
