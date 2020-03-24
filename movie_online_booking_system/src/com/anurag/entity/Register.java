package com.anurag.entity;

public class Register {
	private String name;
	private String password;
	private String phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Register(String name, String password, String phoneNumber) {
		super();
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
