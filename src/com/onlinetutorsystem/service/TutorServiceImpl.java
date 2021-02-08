package com.onlinetutorsystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onlinetutorsystem.dao.TutorDAO;
import com.onlinetutorsystem.domain.Tutor;

@Service
public class TutorServiceImpl implements TutorService{
	
	@Autowired
	private TutorDAO tutorDAO;
	
	public boolean check(Tutor tutor) {
		return tutorDAO.check(tutor);
	}
	
	@Override
	public List<Tutor> getAll() {
		return tutorDAO.findAll();
	}
	
	@Override
	public int add(Tutor tutor) {
		return tutorDAO.addTutor(tutor);
	}
	
	@Override
	public Tutor get(Integer id) {
		return tutorDAO.get(id);
	}
	@Override
	public int update(Tutor tutor) {
		return tutorDAO.updateTutor(tutor);
	}
	
	public int delete(Integer id) {
		return tutorDAO.deleteTutor(id);
	}
	
	public void setTutorDAO(TutorDAO tutorDAO) {
		this.tutorDAO = tutorDAO;
	}

	
}
