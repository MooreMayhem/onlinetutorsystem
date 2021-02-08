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

	@Override
	public int add(Textbook textbook) {
		return textbookDAO.addTextbook(textbook);
	}

	@Override
	public int update(Textbook textbook) {
		return textbookDAO.updateTextbook(textbook);
	}

	@Override
	public int delete(Integer id) {
		return textbookDAO.deleteTextbook(id);
	}

	@Override
	public Textbook get(Integer id) {
		return textbookDAO.get(id);
	}
	
}
