package com.example.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.interview.models.Employee;
import com.example.interview.service.EmployeeService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
    

    @PostMapping("/")
    public String postMethodName(@RequestBody Employee employee) {
        employeeService.employee(employee);
        return "Employee: " + employee.getName() + "created";
    }
    

    @GetMapping("/{id}")
    public String getMethodName(@PathVariable Integer empId) {
        if(employeeService.getEmployee(empId).getName() == null){
            return "insert data";
        }
        return employeeService.getEmployee(empId).getName();
    }
    
}
