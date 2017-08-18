package com.wuyameiju.service;

import java.sql.SQLException;

import com.wuyameiju.entity.user;
import com.wuyameiju.model.*;

public interface userService 
{
	public userMd addUser(user _user) throws SQLException;
	public passMd getPass(String _phone) throws SQLException;

}
