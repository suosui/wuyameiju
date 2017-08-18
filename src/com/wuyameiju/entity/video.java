package com.wuyameiju.entity;

import java.util.Date;


public class video 
{
	private int idVideo;
	private String userphone;
	private String videoname;
	private Date date;
	private String imgsrc;
	private String link;
	private String linkpass;
	public int getIdVideo() {
		return idVideo;
	}
	public void setIdVideo(int idVideo) {
		this.idVideo = idVideo;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getVideoname() {
		return videoname;
	}
	public void setVideoname(String videoname) {
		this.videoname = videoname;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getImgsrc() {
		return imgsrc;
	}
	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getLinkpass() {
		return linkpass;
	}
	public void setLinkpass(String linkpass) {
		this.linkpass = linkpass;
	}

}
