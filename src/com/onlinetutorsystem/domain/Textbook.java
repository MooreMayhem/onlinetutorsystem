package com.onlinetutorsystem.domain;

public class Textbook {
	
	private int ebookId;
	private String title;
	private String author;
	
	public Textbook() {
		
	}
	
	public int getebookId() {
		return ebookId;
	}
	public Textbook(int ebookId, String title, String author) {
		super();
		this.ebookId = ebookId;
		this.title = title;
		this.author = author;
	}
	public void setebookId(int ebookId) {
		this.ebookId = ebookId;
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
