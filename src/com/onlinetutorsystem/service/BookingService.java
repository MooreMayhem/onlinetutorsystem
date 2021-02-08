package com.onlinetutorsystem.service;

import java.util.List;

import com.onlinetutorsystem.domain.Booking;


public interface BookingService {
	public List<Booking> getAll();
	int add(Booking booking);
	Booking get(Integer id);
	int delete(Integer id);
}
