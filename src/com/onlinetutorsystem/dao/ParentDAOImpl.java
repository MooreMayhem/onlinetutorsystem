package com.onlinetutorsystem.dao;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.onlinetutorsystem.domain.Parent;



@Repository
public class ParentDAOImpl implements ParentDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean check(Parent parent) {
		Object params[] = {parent.getEmail(),parent.getPassword()};
		int n = jdbcTemplate.queryForObject("select count(*) from parent where email = ? and password=? ", Integer.class,params); 
		if(n==0)
			return false;
		else
			return true;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
