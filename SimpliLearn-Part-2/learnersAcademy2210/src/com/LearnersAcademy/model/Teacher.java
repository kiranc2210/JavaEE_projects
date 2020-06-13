package com.LearnersAcademy.model;

import java.sql.Date;

public class Teacher {
	
	@Override
	public String toString() {
		return "Teacher [auto_id=" + auto_id + ", teacher_id=" + teacher_id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", gender=" + gender + ", dob=" + dob + ", doa=" + doa + ", fieldOfStudy=" + fieldOfStudy
				+ ", address=" + address + ", email=" + email + ", phone=" + phone + ", password=" + password + "]";
	}

	private int auto_id;
	private String teacher_id;  	
	private String firstname;
	private String lastname;
	private String gender;
	private Date dob;
	private Date doa;
	private String fieldOfStudy;
	private String address;
	private String email;
	private String phone;
	private String password;

	
	public Teacher(int auto_id, String teacher_id, String firstname, String lastname, String gender, Date dob, Date doa,
			String fieldOfStudy, String address, String email, String phone, String password) {
		super();
		this.auto_id = auto_id;
		this.teacher_id = teacher_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.dob = dob;
		this.doa = doa;
		this.fieldOfStudy = fieldOfStudy;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.password = password;
		
	}
	
	public Teacher(){}

	public int getAuto_id() {
		return auto_id;
	}

	public void setAuto_id(int auto_id) {
		this.auto_id = auto_id;
	}

	public String getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoa() {
		return doa;
	}

	public void setDoa(Date doa) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	



}
