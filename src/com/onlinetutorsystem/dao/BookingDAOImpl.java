package com.onlinetutorsystem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import com.onlinetutorsystem.domain.Booking;

@Repository
public class BookingDAOImpl implements BookingDAO {
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Booking> findAll() {
		return jdbcTemplate.query("select * from booking", new BeanPropertyRowMapper<Booking>(Booking.class));
	}
	
	@Override
	public int addBooking(Booking booking) {
		String sql = "insert into booking(bookingId, bookingType, tutorId, parentId) values(?,?,?)";
		return jdbcTemplate.update(sql, booking.getBookingId(),booking.getBookingType(),booking.getTutorId(), booking.getParentId());
	}
	
	public Booking get(Integer id) {
		String sql = "select * from booking where bookingId=" + id;
		
		ResultSetExtractor<Booking> extractor = new ResultSetExtractor<Booking>() {
			
			@Override
			public Booking extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					int id = rs.getInt("bookingId");
					String bookingType = rs.getString("bookingType");
					int tutorId = rs.getInt("tutorId");
					int parentId = rs.getInt("parentId");
					return new Booking(id, bookingType, tutorId, parentId);
				}
				return null;
			}
		};
		return jdbcTemplate.query(sql, extractor);
	}
	
	public int deleteBooking(Integer id) {
		String sql = "delete from booking where bookingId=" + id;
		return jdbcTemplate.update(sql);
	}

}
