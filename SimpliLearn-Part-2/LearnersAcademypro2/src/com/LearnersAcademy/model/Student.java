/**
 * 
 */
package com.LearnersAcademy.model;

import java.sql.Date;

/**
 * @author Isura
 *
 */
public class Student {
	private int auto_id;
	private String student_id;
	private String firstname;
	private String lastname;
	private String emial;
	private String gender;
	private Date dateOfBirth;
	private Date dateOfAdmission;	
	private String address;
	private String phone;
	private String guardian;
	private int grade;
	private String usertype;
	private String user_id;
	
	
	public Student(){}


	public Student(int auto_id, String student_id, String firstname, String lastname, String emial, String gender,
			Date dateOfBirth, Date dateOfAdmission, String address, String phone, String guardian, int grade,
			String usertype,String user_id) {
		super();
		this.auto_id = auto_id;
		this.student_id = student_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emial = emial;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.dateOfAdmission = dateOfAdmission;
		this.address = address;
		this.phone = phone;
		this.guardian = guardian;
		this.grade = grade;
		this.usertype = usertype;
		this.user_id = user_id;
	}


	public int getAuto_id() {
		return auto_id;
	}


	public void setAuto_id(int auto_id) {
		this.auto_id = auto_id;
	}


	public String getStudent_id() {
		return student_id;
	}


	public void setStudent_id(String student_id) {
		this.student_id = student_id;
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


	public String getEmial() {
		return emial;
	}


	public void setEmial(String emial) {
		this.emial = emial;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Date getDateOfAdmission() {
		return dateOfAdmission;
	}


	public void setDateOfAdmission(Date dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getGuardian() {
		return guardian;
	}


	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public String getUsertype() {
		return usertype;
	}


	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	@Override
	public String toString() {
		return "Student [auto_id=" + auto_id + ", student_id=" + student_id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", emial=" + emial + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfAdmission=" + dateOfAdmission + ", address=" + address + ", phone=" + phone + ", guardian="
				+ guardian + ", grade=" + grade + ", usertype=" + usertype + ", user_id=" + user_id + "]";
	}


	
	
}