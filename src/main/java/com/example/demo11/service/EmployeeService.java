package com.example.demo11.service;

import com.example.demo11.entity.Department;
import com.example.demo11.entity.Employee;
import com.example.demo11.entity.Student;

import java.util.List;

public interface EmployeeService {
    List<Employee> fetchEmployeeList();
}
