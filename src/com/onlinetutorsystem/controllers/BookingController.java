package com.onlinetutorsystem.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.onlinetutorsystem.domain.Booking;
import com.onlinetutorsystem.service.BookingService;


public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@RequestMapping(value = "/booking", method = RequestMethod.GET)
	public String getBooking(Model model){
		List<Booking> booking = bookingService.getAll();
		model.addAttribute("booking",booking);
		return "/showbookings";
	}
	

	@RequestMapping(value = "/newbooking", method = RequestMethod.GET)
	public ModelAndView newbooking(ModelAndView model){
		Booking newbooking = new Booking();
		model.addObject("booking", newbooking);
		model.setViewName("savebooking");
		return model;
	}
		
		
		@RequestMapping(value = "/addbooking", method = RequestMethod.POST)
		public ModelAndView addbooking(@ModelAttribute Booking booking) {
				bookingService.add(booking);
			return new ModelAndView("redirect:/booking");
	}
		
		@RequestMapping(value = "/deletebooking", method = RequestMethod.GET)
		public ModelAndView deletebooking(@RequestParam(value="bookingId") Integer id) {
			bookingService.delete(id);
			return new ModelAndView("redirect:/booking");
		}
		
		@RequestMapping(value = "/editbooking", method = RequestMethod.GET)
		public ModelAndView editbooking(HttpServletRequest request){
			Integer id = Integer.parseInt(request.getParameter("bookingId"));
			Booking booking = bookingService.get(id);
			ModelAndView model = new ModelAndView();
			model.addObject("booking", booking);
			model.setViewName("savebooking");
			return model;
	}
		
	
	public void setbookingservice(BookingService bookingService) {
		this.bookingService = bookingService;
	}
}
