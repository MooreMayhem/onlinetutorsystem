package com.onlinetutorsystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.onlinetutorsystem.domain.Admin;


@Repository
public class AdminDAOImpl implements AdminDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean check(Admin admin) {
		Object params[] = {admin.getEmail(),admin.getPassword()};
		int n = jdbcTemplate.queryForObject("select count(*) from admin where email = ? and password=? ", Integer.class,params); 
		if(n==0)
			return false;
		else
			return true;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
