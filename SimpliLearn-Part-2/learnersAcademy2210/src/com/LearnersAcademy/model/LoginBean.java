package com.LearnersAcademy.model;

public class LoginBean {

	private int auto_id;
	private String user_id,password,usertype,email,firstname,lastname;
	
	public LoginBean(){
		
	}

	
	public LoginBean(int auto_id, String user_id, String password, String usertype, String email, String firstname,
			String lastname) {
		super();
		this.auto_id = auto_id;
		this.user_id = user_id;
		this.password = password;
		this.usertype = usertype;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
	}




	public int getAuto_id() {
		return auto_id;
	}

	public void setAuto_id(int auto_id) {
		this.auto_id = auto_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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




	@Override
	public String toString() {
		return "LoginBean [auto_id=" + auto_id + ", user_id=" + user_id + ", password=" + password + ", usertype="
				+ usertype + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
	
}
