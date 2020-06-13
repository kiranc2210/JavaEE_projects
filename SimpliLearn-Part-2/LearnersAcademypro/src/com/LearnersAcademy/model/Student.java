package com.LearnersAcademy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "STUDENT")
public class Student {
 
    @Id
    @GeneratedValue
    @Column(name = "STUDENT_ID")
    private long id;
 
    @Column(name = "FIRST_NAME")
    private String firstName;
 
    @Column(name = "LAST_NAME")
    private String lastName;
 
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "DATE OF BIRTH")
    private String dob;
    
    @Column(name = "ADDRRESS")
    private String address;
 
    
    @ManyToOne(optional = false)
    @JoinColumn(name="CLASS_ID")
    private Classe clas;
 
 
    public Student() {
    }
 
    public Student(String firstName, String lastName, String gender, String dob,String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getGender() {
        return gender;
    }
 
    public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Classe getClas() {
		return clas;
	}

	public void setClas(Classe clas) {
		this.clas = clas;
	}

	public void setGender(String gender) {
        this.gender = gender;
    }
 
 
 
    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
                + lastName + ", gender=" + gender + "]";
    }
 
}