package com.accenture.userLogin.model;

import javax.persistence.*;

@Entity
@Table(name = "data")
public class UserData {

	private String name;
	private String lastName;
	
	//@PrimaryKeyJoinColumn(name = "user")
	@OneToOne
	@Id
	@JoinColumn(name = "user")
	private UserLogin loginData;
	
	public UserData(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserLogin getLoginData() {
		return loginData;
	}

	public void setLoginData(UserLogin loginData) {
		this.loginData = loginData;
	}
	
	
	
}
