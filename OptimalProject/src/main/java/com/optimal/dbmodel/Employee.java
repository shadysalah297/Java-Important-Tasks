package com.optimal.dbmodel;
// Generated Sep 25, 2017 11:37:56 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "employee",
         catalog = "optimal"
)
public class Employee implements java.io.Serializable {

    private Integer id;
    private Job job;
    private Departments departments;
    private String firstName;
    private String address;
    private String phone;
    private String birthDate;

    public Employee() {
    }

    public Employee(Job job, Departments departments, String firstName, String address, String phone, String birthDate) {
        this.job = job;
        this.departments = departments;
        this.firstName = firstName;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id")
    public Job getJob() {
        return this.job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    public Departments getDepartments() {
        return this.departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "address")
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "phone")
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "birth_date", length = 45)
    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

}
