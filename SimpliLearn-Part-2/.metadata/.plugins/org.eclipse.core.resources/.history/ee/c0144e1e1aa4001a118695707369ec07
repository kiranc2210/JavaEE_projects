
package com.LearnersAcademy.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class StudentBean {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="StudentID")
	private int student_id;
	
	@Column(name="FirstName")
	private String firstname;
	
	@Column(name="LastName")
	private String lastname;
	
	@Column(name="EMAIL")
	private String emial;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="DateOfBirth")
	private String dateOfBirth;
	
	@Column(name="DateOfAdmission")
	private String dateOfAdmission;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Phone")
	private String phone;

	
	
	public StudentBean(){}


	public StudentBean( String firstname, String lastname, String emial, String gender,
			String dateOfBirth, String dateOfAdmission, String address, String phone) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.emial = emial;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.dateOfAdmission = dateOfAdmission;
		this.address = address;
		this.phone = phone;
		
	}


	

	public int getStudent_id() {
		return student_id;
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


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getDateOfAdmission() {
		return dateOfAdmission;
	}


	public void setDateOfAdmission(String dateOfAdmission) {
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

	@Override
	public String toString() {
		return "StudentBean [student_id=" + student_id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", emial=" + emial + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfAdmission=" + dateOfAdmission + ", address=" + address + ", phone=" + phone +  "]";
	}


	
	
}