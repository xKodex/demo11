package com.example.demo11.controller;

import com.example.demo11.entity.Student;
import com.example.demo11.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired(required=true)
    private StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        Student createResponse = studentService.save(student);
        return createResponse;
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        Student updateResponse = studentService.update(student);
        return updateResponse;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        Student getReponse = studentService.get(id);
        return getReponse;
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestBody Student student) {
        studentService.delete(student);
        return "Record deleted succesfully";
    }
}
