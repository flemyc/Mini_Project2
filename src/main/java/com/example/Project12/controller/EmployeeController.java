package com.example.Project12.controller;

import com.example.Project12.dto.Employee;
import com.example.Project12.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    IEmployeeService empServiceRef;

    @RequestMapping("/welcome")
    public String welcomeEmployee(){
        return "Hello Employee";
    }

    @RequestMapping("/employees")
    public List<Employee> getAllEmployee(){
        return  empServiceRef.getAllEmployee();
    }

    @RequestMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable int empId){
        return empServiceRef.getEmployeeById(empId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return empServiceRef.addEmployee(employee);
    }

    @PutMapping("/employees/{empId}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable int empId){
        return empServiceRef.updateEmployee(employee,empId);
    }

    @DeleteMapping("/employees/{empId}")
    public Employee deleteEmployee(@PathVariable int empId){
        return empServiceRef.deleteEmployee(empId);
    }

}
