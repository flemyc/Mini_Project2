package com.example.Project12.service;

import com.example.Project12.dto.Employee;
import com.example.Project12.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    List<Employee> empList = new ArrayList<>(Arrays.asList(
            new Employee(1,"Roshan","Java"),
            new Employee(2,"Rojan","Python"),
            new Employee(3,"Robin","Php")));

    @Autowired
    private EmployeeRepo repoRef;

    @Override
    public List<Employee> getAllEmployee() {
//        return empList;
        return repoRef.findAll();
    }

    @Override
    public Employee getEmployeeById(int empId) {
//        return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().get();
        return repoRef.getOne(empId);
    }

    @Override
    public Employee addEmployee(Employee employee) {
//        empList.add(employee);
        repoRef.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee, int empId) {
//        for (int i=0;i<empList.size();i++){
//            Employee e = empList.get(i);
//            if (e.getEmpId() == empId){
//                empList.set(i,employee);
//                return e;
//            }
//        }
        repoRef.save(employee);
        return employee;
    }

    @Override
    public Employee deleteEmployee(int empId) {
//        empList.removeIf(e -> e.getEmpId() == empId );
        repoRef.deleteById(empId);
        return null;
    }
}
