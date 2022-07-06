package com.example.demo11.repository;

import com.example.demo11.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
