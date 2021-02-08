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
import com.onlinetutorsystem.domain.Tutor;


@Repository
public class TutorDAOImpl implements TutorDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean check(Tutor tutor) {
		Object params[] = {tutor.getEmail(),tutor.getPassword()};
		int n = jdbcTemplate.queryForObject("select count(*) from tutor where email = ? and password=? ", Integer.class,params); 
		if(n==0)
			return false;
		else
			return true;
	}
	
	@Override
	public List<Tutor> findAll() {
		return jdbcTemplate.query("select * from tutor", new BeanPropertyRowMapper<Tutor>(Tutor.class));
	}
	
	@Override
	public int addTutor(Tutor tutor) {
		String sql = "insert into tutor(tutorId, tutorName, subject, city, email, password, adminId, ebookId) values(?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, tutor.getTutorId(), tutor.getTutorName(), tutor.getSubject(), tutor.getCity(), tutor.getEmail(), tutor.getPassword(), tutor.getAdminId(), tutor.getEbookId());
	}
	
	public Tutor get(Integer id) {
		String sql = "select * from tutor where tutorId=" + id;
		
		ResultSetExtractor<Tutor> extractor = new ResultSetExtractor<Tutor>() {
			
			@Override
			public Tutor extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					int id = rs.getInt("tutorId");
					String name = rs.getString("tutorName");
					String subject = rs.getString("subject");
					String city = rs.getString("city");
					String email = rs.getString("email");
					String password = rs.getString("password");
					int adminId = rs.getInt("adminId");
					int ebookId = rs.getInt("ebookId");
					
					return new Tutor(id, name, subject, city, email, password, adminId, ebookId);
				}
				return null;
			}
		};
		return jdbcTemplate.query(sql, extractor);
	}
	
	public int deleteTutor(Integer id) {
		String sql = "delete from tutor where tutorId=" + id;
		return jdbcTemplate.update(sql);
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int updateTutor(Tutor tutor) {
		String sql = "update tutor SET  tutorName=?, subject=?, city=?, email=?, password=?, adminId=?, ebookId=? where tutorId=?";
		return jdbcTemplate.update(sql, tutor.getTutorName(), tutor.getSubject(), tutor.getCity(), tutor.getEmail(), tutor.getPassword(), tutor.getAdminId(), tutor.getEbookId(), tutor.getTutorId() );
	}

	
	
}
