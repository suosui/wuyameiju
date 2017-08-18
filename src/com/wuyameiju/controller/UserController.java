package com.wuyameiju.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import com.wuyameiju.entity.user;
import com.wuyameiju.model.passMd;
import com.wuyameiju.model.userMd;
import com.wuyameiju.service.impl.userServiceImpl;

@Controller
public class UserController 
{
	
    @Autowired
    @Qualifier("UserServiceImpl")
    private userServiceImpl userServiceImpl;
    
    @RequestMapping(value="/AddUser",method=RequestMethod.POST)
    public @ResponseBody userMd AddUserService(user _user)
    {
    	   
    		return userServiceImpl.addUser(_user);
    }
    
    @RequestMapping("/Register")
    public  String Register()
    {
		return "user/register";
    }
    
    @RequestMapping("/Login")
    public  String Login()
    {
		return "user/login";
    }
    
    @RequestMapping("/Blog")
    public String Blog()
    {
    	return "user/blog";
    }
    @RequestMapping(value="/GetPass",method=RequestMethod.POST)
    public @ResponseBody passMd GetPassService(String phone)
    {
    	return userServiceImpl.getPass(phone);
    }
}
