package com.onlinetutorsystem.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.onlinetutorsystem.domain.Textbook;
import com.onlinetutorsystem.service.TextbookService;

@Controller
public class TextbooksController {
	@Autowired
	private TextbookService textbookService;
	
	@RequestMapping(value = "/ebook", method = RequestMethod.GET)
	public String getTextbooks(Model model){
		List<Textbook> textbook = textbookService.getAll();
		model.addAttribute("ebook",textbook);
		return "showtextbooks";
	}
	
	
	@RequestMapping(value = "/newbook", method = RequestMethod.GET)
	public ModelAndView newTextbook(ModelAndView model){
		Textbook newTextbook = new Textbook();
		model.addObject("ebook", newTextbook);
		model.setViewName("savetextbook");
		return model;
	}
		
		
		@RequestMapping(value = "/addbook", method = RequestMethod.POST)
		public ModelAndView addTextbook(@ModelAttribute Textbook textbook){
			int id = textbook.getebookId();
			if(textbook.getebookId() == id) {
				textbookService.update(textbook);
			}else if(textbook.getebookId() != id){
				textbookService.add(textbook);
			}
			
			return new ModelAndView("redirect:/ebook");
	}
		
		@RequestMapping(value = "/deletebook", method = RequestMethod.GET)
		public ModelAndView deleteTextbook(@RequestParam(value="ebookId") Integer id) {
			textbookService.delete(id);
			return new ModelAndView("redirect:/ebook");
		}
		
		@RequestMapping(value = "/editbook", method = RequestMethod.GET)
		public ModelAndView editTextbook(HttpServletRequest request){
			Integer id = Integer.parseInt(request.getParameter("ebookId"));
			Textbook textbook = textbookService.get(id);
			ModelAndView model = new ModelAndView();
			model.addObject("ebook", textbook);
			model.setViewName("savetextbook");
			return model;
	}
		
	
	public void setTextbookservice(TextbookService textbookService) {
		this.textbookService = textbookService;
	}
	
	
}
