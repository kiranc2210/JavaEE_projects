package com.LearnersAcademy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class TeacherBean {
	
	@Override
	public String toString() {
		return "TeacherBean [ teacher_id=" + teacher_id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", gender=" + gender + ", dob=" + dob + ", doa=" + doa + ", fieldOfStudy=" + fieldOfStudy
				+ ", address=" + address + ", email=" + email + ", phone=" + phone + "]";
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
	
	@Column(name="DateOfAdmission")
	private String doa;
	
	@Column(name="FieldOfStudy")
	private String fieldOfStudy;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Phone")
	private String phone;
	
	
	@Column(name="Email")
	private String email;
	
	public TeacherBean(String firstname, String lastname, String gender, String dob, String doa,
			String fieldOfStudy, String address, String phone, String email) {
		super();
		
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.dob = dob;
		this.doa = doa;
		this.fieldOfStudy = fieldOfStudy;
		this.address = address;
		this.email = email;
		this.phone = phone;
		
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

	public String getDoa() {
		return doa;
	}

	public void setDoa(String doa) {
		this.doa = doa;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
