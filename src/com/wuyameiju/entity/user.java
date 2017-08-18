package com.wuyameiju.entity;

import java.util.Date;

public class user 
{
	private int id;
    private String phone;
    private String password;
    private Date date;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
