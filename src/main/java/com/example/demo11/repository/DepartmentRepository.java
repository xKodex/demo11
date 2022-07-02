package com.example.demo11.repository;

// Importing required classes
//import com.amiya.springbootdemoproject.entity.Department;
import com.example.demo11.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

// Annotation
//@Repository
// Interface
/*public interface DepartmentRepository
        extends JpaRepository<Department, Long> {
}*/


public interface DepartmentRepository extends JpaRepository<Department, Serializable> {

}
