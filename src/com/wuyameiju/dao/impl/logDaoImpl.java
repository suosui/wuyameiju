package com.wuyameiju.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.wuyameiju.beans.PageBean;
import com.wuyameiju.beans.QueryBean;
import com.wuyameiju.dao.logDao;
import com.wuyameiju.entity.log;

public class logDaoImpl implements logDao{

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer save(log entity) {
		// TODO Auto-generated method stub
		String sql = "insert into log(lid,description,method,requestIp,exceptionCode,createDate,createBy) VALUES(default,?,?,?,?,?,?)";
		KeyHolder keyHolder = new GeneratedKeyHolder();  
	      int autoIncId = 0;  
		jdbcTemplate.update(new PreparedStatementCreator() {  
	        public PreparedStatement createPreparedStatement(Connection con)  
	                throws SQLException {  
	            PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS); 
	           
	            ps.setString(1,entity.getDescription());
	            ps.setString(2, entity.getMethod());
	            ps.setString(3, entity.getRequestIp());
	            ps.setString(4, entity.getExceptionCode());
	            ps.setString(5, entity.getCreateDate());
	            ps.setString(6, entity.getCreateBy().toString());
	           
	            return ps;  
	        }  
	    }, keyHolder);  
		autoIncId = keyHolder.getKey().intValue();  
		return autoIncId;
		
		
	}

	@Override
	public boolean delete(log entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(log entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public log findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<log> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<log> findByPage(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<log> findByPage(QueryBean queryBean, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addlog(log entity) {
		// TODO Auto-generated method stub
		
	}

}
