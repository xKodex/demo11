package com.example.demo11.repository;

import com.example.demo11.entity.Department;
import com.example.demo11.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
