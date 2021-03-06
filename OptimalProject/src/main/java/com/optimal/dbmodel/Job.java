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
 * Job generated by hbm2java
 */
@Entity
@Table(name="Job"
    ,catalog="optimal"
)
public class Job  implements java.io.Serializable {


     private Integer id;
     private String jobTitle;
     private String description;
     private Set<Employee> employees = new HashSet<Employee>(0);

    public Job() {
    }

    public Job(String jobTitle, String description, Set<Employee> employees) {
       this.jobTitle = jobTitle;
       this.description = description;
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

    
    @Column(name="job_title", length=200)
    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    
    @Column(name="description", length=200)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="job")
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }




}


