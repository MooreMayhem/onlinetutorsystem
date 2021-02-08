package com.onlinetutorsystem.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.onlinetutorsystem.dao.BookingDAO;
import com.onlinetutorsystem.domain.Booking;



@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	private BookingDAO bookingDAO;
	
	@Override
	public List<Booking> getAll() {
		return bookingDAO.findAll();
	}
	
	public void setBookingDAO(BookingDAO bookingDAO) {
		this.bookingDAO = bookingDAO;
	}
	
	@Override
	public int add(Booking booking) {
		return bookingDAO.addBooking(booking);
	}
	
	@Override
	public Booking get(Integer id) {
		return bookingDAO.get(id);
	}
	
	
	public int delete(Integer id) {
		return bookingDAO.deleteBooking(id);
	}
}
