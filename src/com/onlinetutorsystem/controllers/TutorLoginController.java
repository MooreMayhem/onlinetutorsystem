package com.onlinetutorsystem.controllers;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.onlinetutorsystem.domain.Tutor;
import com.onlinetutorsystem.service.TutorService;

@Controller
public class TutorLoginController {
	@Autowired
	private TutorService tutorService;
	
	@RequestMapping(value = "/tutorlogin", method = RequestMethod.GET)
	public String doLogin() {
		return "tutorloginpage";
	}
	
	@RequestMapping(value="/tutorlogin", method = RequestMethod.POST)
	public String doCheck(String login, String password, HttpSession session, Model model) {
		Tutor t = new Tutor();
		t.setEmail(login);
		t.setPassword(password);
		t.setCity("Joburg");
		t.setEbookId(642642345);
		t.setSubject("Mathematics");
		model.addAttribute("name", login);
		model.addAttribute("city", t.getCity());
		model.addAttribute("subject", t.getSubject());
		model.addAttribute("ebook", t.getEbookId());
		if(tutorService.check(t)) {
			session.setAttribute("user", login);
			return "/welcometutor";}
		else {
			model.addAttribute("msg","Invalid login/password");
			return "tutorloginpage";
		}
		}

		@RequestMapping(value = "/tutors", method = RequestMethod.GET)
		public String getTutors(Model model){
			List<Tutor> tutor = tutorService.getAll();
			model.addAttribute("tutor",tutor);
			return "showtutors";
	}
		
		@RequestMapping(value = "/newtutor", method = RequestMethod.GET)
		public ModelAndView newTutor(ModelAndView model){
			Tutor newTutor = new Tutor();
			model.addObject("tutor", newTutor);
			model.setViewName("savetutors");
			return model;
	}
		
		
		@RequestMapping(value = "/addtutor", method = RequestMethod.POST)
		public ModelAndView addTutor(@ModelAttribute Tutor tutor){
			if(tutor.getTutorId()!=0) {
				tutorService.add(tutor);
			}else {
				tutorService.update(tutor);
			}
			return new ModelAndView("redirect:/tutors");
	}
		
		@RequestMapping(value = "/delete", method = RequestMethod.GET)
		public ModelAndView deleteTutor(@RequestParam(value="tutorId") Integer id) {
			tutorService.delete(id);
			return new ModelAndView("redirect:/tutors");
		}
		
		@RequestMapping(value = "/edit", method = RequestMethod.GET)
		public ModelAndView editTutor(HttpServletRequest request){
			Integer id = Integer.parseInt(request.getParameter("tutorId"));
			Tutor tutor = tutorService.get(id);
			ModelAndView model = new ModelAndView();
			model.addObject("tutor", tutor);
			model.setViewName("savetutors");
			return model;
	}
		
		
		
}
