package com.example.Project12.service;

import com.example.Project12.dto.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int empId);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee, int empId);
    Employee deleteEmployee(int empId);
}
