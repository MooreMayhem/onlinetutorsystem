package com.onlinetutorsystem.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onlinetutorsystem.domain.Parent;
import com.onlinetutorsystem.service.ParentService;

@Controller
public class ParentLoginController {
	@Autowired
	private ParentService parentService;
	
	@RequestMapping(value = "/parentlogin", method = RequestMethod.GET)
	public String doLogin() {
		return "parentloginpage";
	}
	
	@RequestMapping(value="/parentlogin", method = RequestMethod.POST)
	public String doCheck(String login, String password,HttpSession session, Model model) {
		Parent p = new Parent();
		p.setEmail(login);
		p.setPassword(password);
		
		if(parentService.check(p)) {
			session.setAttribute("user", login);
			return "welcomeparent";}
		else {
			model.addAttribute("msg","Invalid login/password");
			return "parentloginpage";
		}
		
	}
}
