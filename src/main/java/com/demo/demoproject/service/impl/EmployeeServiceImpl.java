package com.demo.demoproject.service.impl;

import com.demo.demoproject.model.Employee;
import com.demo.demoproject.repository.EmployeeRepository;
import com.demo.demoproject.service.EmployeeService;

import org.springframework.stereotype.Service;

@Service  // <-- mark the class as a service and to enable bean creation
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

//    @Autowired <-- not required since spring will add it if there is only one constructor
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override public Employee getEmployee(long id) {
        // Optional Employee is returned since the employee existence in the db is optional
        return employeeRepository.findById(id).orElse(null);// orElseThrow(new Exception)
    }

    @Override public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


}
