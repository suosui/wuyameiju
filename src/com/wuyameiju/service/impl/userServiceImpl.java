package com.wuyameiju.service.impl;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wuyameiju.annotation.SystemServiceLog;
import com.wuyameiju.dao.impl.userDaoImpl;
import com.wuyameiju.entity.user;
import com.wuyameiju.model.passMd;
import com.wuyameiju.model.userMd;
import com.wuyameiju.service.userService;

@Service("UserServiceImpl")
public class userServiceImpl implements userService {
    @Autowired
    @Qualifier("UserDaoImpl")
    private userDaoImpl userDao;
	
     
	@Transactional(readOnly = false, rollbackFor = DataAccessException.class)
	@SystemServiceLog(description = "添加用户") 
	@Override
	public userMd addUser(user _user)  {
		// TODO Auto-generated method s
		userMd userMd = new userMd();
    	Integer id = userDao.save(_user);
    	if (id!=null) {
			userMd.setId(id);
			userMd.setPassword(_user.getUpass());
	    	userMd.setDate(new Date());        
	        userMd.setPhone(_user.getUphone());
	    	
		}
    	else
    	{
    		userMd.setId(0);
			userMd.setPassword("error");
	    	userMd.setDate(new Date());
	        userMd.setPhone("-1");
    	}
    	return userMd;
    	
    	
    	
	}

	@Transactional(readOnly = false, rollbackFor = DataAccessException.class)
	@Override
	public passMd getPass(String _phone)  {
		// TODO Auto-generated method stub
		
		passMd md = new passMd();
		
		String pass = userDao.getPass(_phone);
		if(pass!=null)
		{
			md.setPassword(pass);
		}
		else
		{
			md.setPassword("error");
		}
		md.setPhone(_phone);
		
		return md;
	}

}
