package com.onlinetutorsystem.service;

import java.util.List;

import com.onlinetutorsystem.domain.Textbook;

public interface TextbookService {
	public List<Textbook> getAll();

	public int add(Textbook textbook);

	int update(Textbook textbook);

	int delete(Integer id);

	public Textbook get(Integer id);
	
}
