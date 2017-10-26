package com.wuyameiju.entity;

import java.util.Date;

public class user 
{
	private int uid;
    private String uphone;
    private String uname;
    private String upass;
    private Date uregisDate;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public Date getUregisDate() {
		return uregisDate;
	}
	public void setUregisDate(Date uregisDate) {
		this.uregisDate = uregisDate;
	}
    
	
}
