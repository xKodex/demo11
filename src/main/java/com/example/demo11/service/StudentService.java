package com.example.demo11.service;

import com.example.demo11.entity.Student;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface StudentService {
    public Student save(Student student);
    public Student update(Student student);
    public Student get(Long id);
    public void delete(Student student);
    public Map<String,String> getAllStudents(String organizationCode, String stId);
    public List<Student> findById(Long id);

}
