package com.onlinetutorsystem.dao;



import org.springframework.jdbc.core.JdbcTemplate;

import com.onlinetutorsystem.domain.Parent;

public interface ParentDAO {

	boolean check(Parent parent);
	void setJdbcTemplate(JdbcTemplate jdbcTemplate);

}
