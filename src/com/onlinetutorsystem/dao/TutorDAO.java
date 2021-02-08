package com.onlinetutorsystem.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.onlinetutorsystem.domain.Tutor;

public interface TutorDAO {
	boolean check(Tutor tutor);
	void setJdbcTemplate(JdbcTemplate jdbcTemplate);
	List<Tutor> findAll();
	int addTutor(Tutor tutor);
	int deleteTutor(Integer id);
	int updateTutor(Tutor tutor);
	Tutor get(Integer id);
}
 