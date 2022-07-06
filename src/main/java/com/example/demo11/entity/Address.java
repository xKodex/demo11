package com.example.demo11.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
/*@Transactional
@Data
@NoArgsConstructor*/
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Long addressId;
    private String city;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

  /*  public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }*/

    private String addressType;

    // for bidirectional one to one mapping
    //@OneToOne(mappedBy = "address")
    //private Employee employee;

    /*@ManyToOne
    @JoinColumn(name = "fk_emp_id")
    private Employee employee;*/
}
