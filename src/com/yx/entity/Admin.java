package com.yx.entity;

public class Admin {
	//1
	private int id;
	private String userName;
	private String password;
	
	//2
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	//3
	public Admin() {
		
	}
	public Admin(int id, String userName, String password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

}
