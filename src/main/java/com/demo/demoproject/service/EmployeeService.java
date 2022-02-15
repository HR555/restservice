package com.demo.demoproject.service;

import com.demo.demoproject.model.Employee;

public interface EmployeeService {

    Employee getEmployee(long id);

    Employee saveEmployee(Employee employee);
}
