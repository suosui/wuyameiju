package com.wuyameiju.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Collection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;  
import com.wuyameiju.annotation.SystemControllerLog;
import com.wuyameiju.entity.user;
import com.wuyameiju.model.passMd;
import com.wuyameiju.model.userMd;
import com.wuyameiju.service.impl.userServiceImpl;
import com.wuyameiju.util.WebConstants;

@Controller
public class UserController 
{
	
    @Autowired
    @Qualifier("UserServiceImpl")
    private userServiceImpl userServiceImpl;
    
    String msg =null;
    /**
     * 
     */
    Model model = new Model() {
		
		@Override
		public Model mergeAttributes(Map<String, ?> arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean containsAttribute(String arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Map<String, Object> asMap() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Model addAttribute(String arg0, Object arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Model addAttribute(Object arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Model addAllAttributes(Map<String, ?> arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Model addAllAttributes(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return null;
		}
	};
    
    @RequestMapping(value="/AddUser.do",method=RequestMethod.POST)
    @SystemControllerLog(description = "添加用户（用户注册）") 
    public @ResponseBody userMd AddUserService(user _user,HttpServletRequest request)
    {
    	
    	try {
    		HttpSession session = request.getSession(); 
    		user user = (user) session.getAttribute(WebConstants.CURRENT_USER_KEY);
		} catch (Exception e) {
			// TODO: handle exception
			msg = "添加失败！";
		}
    	finally {
			model.addAttribute("msg", msg);
			
		}
		return userServiceImpl.addUser(_user);
 
    }
    
    @RequestMapping("/Register.do")
    public  String Register()
    {
		return "user/register";
    }
    
    @RequestMapping("/Login.do")
    public  String Login()
    {
		return "user/login";
    }
    
    @RequestMapping("/Blog.do")
    public String Blog()
    {
    	return "user/blog";
    }
    @RequestMapping(value="/GetPass.do",method=RequestMethod.POST)
    public @ResponseBody passMd GetPassService(String phone)
    {
    	return userServiceImpl.getPass(phone);
    }
}
