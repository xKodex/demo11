package com.example.demo11.controller;

import com.example.demo11.entity.Employee;
import com.example.demo11.repository.EmployeeRepository;
import com.example.demo11.service.DepartmentService;
import com.example.demo11.service.EmployeeService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController
//@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    //private EmployeeRepository empRepository;
    private EmployeeService employeeService;

   /* @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData) {
        empRepository.saveAll(empData);
        return ResponseEntity.ok("Data saved");
    }*/

    @GetMapping("/getEmployees")
  //  public List<Employee> getEmployees(){
 //   public  Map<String, Object> getEmployees(){
  //   public  Iterable<Employee> getEmployees(){
    public  List<Employee>  getEmployees() {
        //List<Employee> emp = empRepository.findAll();
        // Iterable<Employee> iterable = empRepository.findAll();
        // String jsonStr = java.ltang.String toJSONString(emp);
       /* Map<String, Object> filteredList = new HashMap<>();


        if (emp.size() > 0 ) {
            filteredList.put("emp", emp);
        }*/
        List<Employee> emp = employeeService.fetchEmployeeList();
        ///eturn filteredList;
        // return iterable;
      //  return emp;
        //return empRepository.findAll();
        return employeeService.fetchEmployeeList();
    }
}