package com.web.entity;

public class User {

	private String name;
	
	private String pwd;

	private Double hair;

	public Double getHair() {
		return hair;
	}

	public void setHair(Double hair) {
		this.hair = hair;
	}

	public User() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
