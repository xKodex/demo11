package com.example.demo11.service;

import com.example.demo11.entity.Student;
import com.example.demo11.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class StudentServiceImpl   implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    //@Transactional
    public Student save(Student student) {
        Student createResponse = studentRepository.save(student);
        return createResponse;
    }

   // @Transactional
    public Student update(Student student) {
        Student updateResponse = studentRepository.save(student);
        return updateResponse;
    }

    //@Transactional
    public Student get(Long id) {
        Optional<Student> studentResponse = studentRepository.findById(id);
        Student getResponse = studentResponse.get();
        return getResponse;
    }

    //@Transactional
    public void delete(Student student) {
        studentRepository.delete(student);
    }

   // public static interface StudentRepository extends JpaRepository<Student, Serializable> {

   // }
}
