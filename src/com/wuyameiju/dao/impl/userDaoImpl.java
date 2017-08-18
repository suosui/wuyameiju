package com.wuyameiju.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;



import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.wuyameiju.beans.PageBean;
import com.wuyameiju.beans.QueryBean;
import com.wuyameiju.dao.userDao;
import com.wuyameiju.entity.user;
import com.wuyameiju.model.userMd;
@Repository("UserDaoImpl")
public class userDaoImpl  implements userDao  {
	// @Autowire注释:按类型匹配(可以对类成员变量/方法以及构造函数进行标注,完成自动装配的工作)
	
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
	@Override
	public Integer save(user entity) {
		// TODO Auto-generated method stub
		String sql = "insert into user(id,phone,password,date) VALUES(default,?,?,default)";
		KeyHolder keyHolder = new GeneratedKeyHolder();  
	      int autoIncId = 0;  
		jdbcTemplate.update(new PreparedStatementCreator() {  
	        public PreparedStatement createPreparedStatement(Connection con)  
	                throws SQLException {  
	            PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);  
	            ps.setString(1,entity.getPhone()); 
	            ps.setString(2, entity.getPassword());
	            //ps.setString(2, (entity.getDate()).toString());
	            return ps;  
	        }  
	    }, keyHolder);  
		autoIncId = keyHolder.getKey().intValue();  
		return autoIncId;
	}

	@Override
	public boolean delete(user entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(user entity) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public List<user> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<user> findByPage(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<user> findByPage(QueryBean queryBean, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public userMd AddUser(user _user) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public user findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPass(String _phone) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT password FROM user WHERE phone = ?";
		
		String pass = (String)jdbcTemplate.queryForObject(
				sql, new Object[] { _phone }, String.class);
		
		
		return pass;
	}

}
