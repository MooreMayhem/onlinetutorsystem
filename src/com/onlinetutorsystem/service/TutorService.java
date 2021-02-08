package com.onlinetutorsystem.service;


import java.util.List;

import com.onlinetutorsystem.domain.Tutor;

public interface TutorService {
	boolean check(Tutor t);
	List<Tutor> getAll();
	int add(Tutor tutor);
	int update(Tutor tutor);
	Tutor get(Integer id);
	int delete(Integer id);
}
