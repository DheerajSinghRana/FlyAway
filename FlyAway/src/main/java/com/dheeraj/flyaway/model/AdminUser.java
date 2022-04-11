package com.dheeraj.flyaway.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminUser {
	
	private String name;
	@Id
	private String userId;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return userId;
	}
	public void setId(String id) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminUser [name=" + name + ", userId=" + userId + ", password=" + password + "]";
	}

}
