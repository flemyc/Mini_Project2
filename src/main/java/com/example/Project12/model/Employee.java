package com.example.Project12.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int empId;
    private String empName;
    private String empTech;

    public Employee(){
    }

    public Employee(int empId, String empName, String empTech) {
        this.empId = empId;
        this.empName = empName;
        this.empTech = empTech;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpTech() {
        return empTech;
    }

    public void setEmpTech(String empTech) {
        this.empTech = empTech;
    }
}
