package com.wuyameiju.service;

import java.sql.SQLException;

import com.wuyameiju.entity.log;



public interface logService {
	public void add(log entity) throws SQLException;
}
