package com.onlinetutorsystem.domain;

public class Textbook {
	
	private int eBookId;
	private String title;
	private String author;
	
	public int geteBookId() {
		return eBookId;
	}
	public void seteBookId(int eBookId) {
		this.eBookId = eBookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
