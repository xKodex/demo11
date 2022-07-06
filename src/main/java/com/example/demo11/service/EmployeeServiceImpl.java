package com.example.demo11.service;

import com.example.demo11.entity.Department;
import com.example.demo11.entity.Employee;
import com.example.demo11.repository.EmployeeRepository;
import com.example.demo11.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Transactional
    public List<Employee> fetchEmployeeList() {
        return (List<Employee>)
                employeeRepository.findAll();
    }
}
