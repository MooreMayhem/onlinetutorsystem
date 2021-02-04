package com.onlinetutorsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetutorsystem.dao.TextbookDAO;
import com.onlinetutorsystem.domain.Textbook;

@Service
public class TextbookServiceImpl implements TextbookService {
	
	@Autowired
	private TextbookDAO textbookDAO;
	
	@Override
	public List<Textbook> getAll() {
	
		return textbookDAO.findAll();
	}
	
	public void setTextbookDAO(TextbookDAO textbookDAO) {
		this.textbookDAO = textbookDAO;
	}
	
}
