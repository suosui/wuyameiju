package com.wuyameiju.controller;

import java.io.File;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wuyameiju.common.CookieUtil;
import com.wuyameiju.entity.video;
import com.wuyameiju.model.videoMd;
import com.wuyameiju.service.impl.videoServiceImpl;

@Controller
public class Test
{
	
	
	@RequestMapping("/test")
	public String test()
	{
		return "video/myVideo";
	}
	
  
 
}
