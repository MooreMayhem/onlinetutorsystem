package com.onlinetutorsystem.dao;

import java.util.List;

import com.onlinetutorsystem.domain.Booking;


public interface BookingDAO {
	public List<Booking> findAll();
	int addBooking(Booking booking);
	int deleteBooking(Integer id);
	Booking get(Integer id);
}
