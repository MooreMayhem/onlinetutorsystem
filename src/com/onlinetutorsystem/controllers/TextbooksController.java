package com.onlinetutorsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public void setTextbookservice(TextbookService textbookService) {
		this.textbookService = textbookService;
	}
	
}
