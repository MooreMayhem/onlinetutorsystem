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

import com.onlinetutorsystem.domain.Textbook;


@Repository
public class TextbookDAOImpl implements TextbookDAO {
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Textbook> findAll() {
		return jdbcTemplate.query("select * from ebook", new BeanPropertyRowMapper<Textbook>(Textbook.class));
	}
	
	@Override
	public int addTextbook(Textbook textbook) {
		String sql = "insert into ebook(ebookId, title, author) values(?,?,?)";
		return jdbcTemplate.update(sql, textbook.getebookId(),textbook.getTitle(),textbook.getAuthor());
	}
	
	public Textbook get(Integer id) {
		String sql = "select * from ebook where ebookId=" + id;
		
		ResultSetExtractor<Textbook> extractor = new ResultSetExtractor<Textbook>() {
			
			@Override
			public Textbook extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					int id = rs.getInt("ebookId");
					String title = rs.getString("title");
					String author = rs.getString("author");
					return new Textbook(id, title, author);
				}
				return null;
			}
		};
		return jdbcTemplate.query(sql, extractor);
	}
	
	public int deleteTextbook(Integer id) {
		String sql = "delete from ebook where ebookId=" + id;
		return jdbcTemplate.update(sql);
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int updateTextbook(Textbook textbook) {
		String sql = "update ebook SET  title=?, author=?";
		return jdbcTemplate.update(sql, textbook.getTitle(), textbook.getAuthor());
	}

}
