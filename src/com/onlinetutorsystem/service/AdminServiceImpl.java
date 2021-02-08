package com.onlinetutorsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetutorsystem.dao.AdminDAO;
import com.onlinetutorsystem.domain.Admin;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO adminDAO;
	
	public boolean check(Admin admin) {
		return adminDAO.check(admin);
	}
	
	
	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}
}
