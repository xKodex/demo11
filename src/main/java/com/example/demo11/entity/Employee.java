package com.example.demo11.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Entity
//@Transactional
//@Data
//@NoArgsConstructor
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    private String empName;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    private Integer empAge;
    //address_add_id - default fk column name
    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "fk_add_id")

    //unidirectional one-to-many
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")
    private List<Address> address;



}
