package com.example.interview.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.interview.models.Employee;

@Service
public class EmployeeService {
    HashMap<Integer, Employee> empMap;

    public EmployeeService() {
        this.empMap = new HashMap<>();
    }

    public void employee(Employee employee) {
        empMap.put(employee.getId(), employee);
    }

    public Employee getEmployee(int empId) {
        return empMap.get(empId);
    }
}
