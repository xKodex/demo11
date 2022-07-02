package com.example.demo11.service;

import com.example.demo11.entity.Student;

public interface StudentService {
    public Student save(Student student);
    public Student update(Student student);
    public Student get(Long id);
    public void delete(Student student);

}
