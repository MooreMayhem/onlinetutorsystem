package com.onlinetutorsystem.domain;

public class Tutor {	
	private int tutorId;
	private String tutorName;
	private String city;
	private String subject;
	private String email;
	private String password;
	private int adminId;
	private int ebookId;
	
	public Tutor() {
		
	}
	public Tutor(int tutorId, String tutorName, String city, String subject, String email, String password, int adminId,
			int ebookId) {
		super();
		this.tutorId = tutorId;
		this.tutorName = tutorName;
		this.city = city;
		this.subject = subject;
		this.email = email;
		this.password = password;
		this.adminId = adminId;
		this.ebookId = ebookId;
	}
	
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	
	public String getTutorName() {
		return tutorName;
	}
	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public int getEbookId() {
		return ebookId;
	}
	public void setEbookId(int ebookId) {
		this.ebookId = ebookId;
	}

}
