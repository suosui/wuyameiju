package com.wuyameiju.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wuyameiju.dao.impl.logDaoImpl;

import com.wuyameiju.entity.log;
import com.wuyameiju.service.logService;
@Service("LogServiceImpl")
public class logServiceImpl implements logService
{
	@Autowired
    @Qualifier("LogDaoImpl")
    private logDaoImpl logDaoImpl;
	@Override
	public void add(log entity) throws SQLException {
		// TODO Auto-generated method stub
		Integer id = logDaoImpl.save(entity);
	}

}
