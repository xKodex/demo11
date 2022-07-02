package com.example.demo11.repository;

import com.example.demo11.entity.Department;
import com.example.demo11.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;


public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
