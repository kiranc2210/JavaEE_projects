
package com.LearnersAcademy.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	

	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="DateOfBirth")
	private String dateOfBirth;
	
	
	
	@Column(name="Address")
	private String address;
	

	 @ManyToOne(optional = false)
	    @JoinColumn(name="CLASS_ID")
	    private ClassBean clas;
	 
	
	
	public StudentBean(){}


	public StudentBean( String firstname, String lastname,  String gender,
			String dateOfBirth,  String address) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	
		this.address = address;
		
		
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




	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "StudentBean [student_id=" + student_id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ",  address=" + address + ",]";
	}


	
	
}