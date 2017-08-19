package com.wuyameiju.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Hello
{
	@RequestMapping("/hello.do")
    public  String hello()
    {
		return "hello";
    }
}
