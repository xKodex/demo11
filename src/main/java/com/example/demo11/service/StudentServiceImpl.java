package com.example.demo11.service;

import com.example.demo11.entity.Student;
import com.example.demo11.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
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

    @Override
    public Map<String, String> getAllStudents(String organizationCode, String stId) {

        Map<String,String> map=new HashMap<>();
        map.put("1","Pakistan");
        map.put("2","India");
        map.put("3","Bangladesh");
        map.put("4","Iraq");
        map.put("5","South Africa");

        return map;
    }

    @Override
    public List<Student> findById(Long id) {


        return null;
    }

    // public static interface StudentRepository extends JpaRepository<Student, Serializable> {

   // }
}
