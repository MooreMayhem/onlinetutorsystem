package com.onlinetutorsystem.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.onlinetutorsystem.domain.Admin;


public interface AdminDAO {
	boolean check(Admin admin);
	void setJdbcTemplate(JdbcTemplate jdbcTemplate);
}
