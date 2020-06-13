package com.LearnersAcademy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class TeacherBean {
	
	@Override
	public String toString() {
		return "TeacherBean [ teacher_id=" + teacher_id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", gender=" + gender + ", dob=" + dob + ",  fieldOfStudy=" + fieldOfStudy
				+ ", address=" + address + ", ]";
	}

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private int teacher_id;  
	
	@Column(name="FirstName")
	private String firstname;
	
	@Column(name="LastName")
	private String lastname;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="DateofBirth")
	private String dob;
	

	
	@Column(name="FieldOfStudy")
	private String fieldOfStudy;
	
	@Column(name="Address")
	private String address;
	
	 @ManyToOne(optional = false)
	   @JoinColumn(name="CLASS_ID")
	   private ClassBean clas;
	   
	   @OneToOne(optional = false)
	   @JoinColumn(name="SUBJECT_ID")
	   private SubjectBean subject;
	
	
	
	public TeacherBean(String firstname, String lastname, String gender, String dob, 
			String fieldOfStudy, String address) {
		super();
		
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.dob = dob;
	
		this.fieldOfStudy = fieldOfStudy;
		this.address = address;
		
	}
	
	public TeacherBean(){}

	public int getTeacher_id() {
		return teacher_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}
