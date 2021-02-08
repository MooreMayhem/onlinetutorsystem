package com.onlinetutorsystem.dao;

import java.util.List;
import com.onlinetutorsystem.domain.Textbook;

public interface TextbookDAO {

	public List<Textbook> findAll();
	int updateTextbook(Textbook textbook);
	int deleteTextbook(Integer id);
	Textbook get(Integer id);
	int addTextbook(Textbook textbook);
	
}
