package com.onlinetutorsystem.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onlinetutorsystem.domain.Admin;

import com.onlinetutorsystem.service.AdminService;


@Controller
public class AdminLoginController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	public String doLogin() {
		return "adminloginpage";
	}
	
	@RequestMapping(value="/adminlogin", method = RequestMethod.POST)
	public String doCheck(String login, String password, HttpSession session, Model model) {
		Admin a = new Admin();
		a.setEmail(login);
		a.setPassword(password);
		if(adminService.check(a)) {
			session.setAttribute("user", login);
			return "welcomeadmin";}
		else {
			model.addAttribute("msg","Invalid login/password");
			return "adminloginpage";
		}
	}
}
