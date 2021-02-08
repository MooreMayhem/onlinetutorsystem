package com.onlinetutorsystem.domain;

public class Booking {
	private int bookingId;
	private String bookingType;
	private int parentId;
	private int tutorId;
	
	public Booking() {
		
	}
	
	public Booking(int bookingId, String bookingType, int parentId, int tutorId) {
		super();
		this.bookingId = bookingId;
		this.bookingType = bookingType;
		this.parentId = parentId;
		this.tutorId = tutorId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingTpe(String bookingType) {
		this.bookingType = bookingType;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}

}
