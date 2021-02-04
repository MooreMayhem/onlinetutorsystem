package com.onlinetutorsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.onlinetutorsystem.domain.Textbook;

@Repository
public class TextbookDAOImpl implements TextbookDAO {
	@Autowired 
	private JdbcTemplate JdbcTemplate;
	
	@Override
	public List<Textbook> findAll() {
		
		return JdbcTemplate.query("select * from ebook", new BeanPropertyRowMapper<Textbook>(Textbook.class));
	}
	
}
