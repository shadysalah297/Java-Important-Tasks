package com.optimal.dbmodel;
// Generated Sep 25, 2017 11:37:56 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Departments generated by hbm2java
 */
@Entity
@Table(name="departments"
    ,catalog="optimal"
)
public class Departments  implements java.io.Serializable {


     private Integer id;
     private String title;
     private String descrption;
     private Set<Employee> employees = new HashSet<Employee>(0);

    public Departments() {
    }

    public Departments(String title, String descrption, Set<Employee> employees) {
       this.title = title;
       this.descrption = descrption;
       this.employees = employees;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="title", length=200)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="descrption", length=500)
    public String getDescrption() {
        return this.descrption;
    }
    
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="departments")
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }




}


