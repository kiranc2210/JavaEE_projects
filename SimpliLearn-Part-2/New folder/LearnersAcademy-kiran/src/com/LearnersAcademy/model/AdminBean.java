package com.LearnersAcademy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AdminBean {

	@Id	
	@Column(name = "admin_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
private int id;	
private String firstname;
private String lastname;
private String address;
private String email;
private String phone;private String password;


public AdminBean( String firstname, String lastname, String address, String email, String phone,
		String password ) {
	super();
	
	this.firstname = firstname;
	this.lastname = lastname;
	this.address = address;
	this.email = email;
	this.phone = phone;
	this.password = password;
	
}

public AdminBean(){}

public int getId() {
	return id;
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
