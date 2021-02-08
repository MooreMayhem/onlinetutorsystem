package com.onlinetutorsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetutorsystem.dao.ParentDAO;
import com.onlinetutorsystem.domain.Parent;

@Service
public class ParentServiceImpl implements ParentService{
	
	@Autowired
	private ParentDAO parentDAO;
	
	public boolean check(Parent parent) {
		return parentDAO.check(parent);
	}
	
	
	public void setParentDAO(ParentDAO parentDAO) {
		this.parentDAO = parentDAO;
	}
}
