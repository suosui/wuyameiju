package com.wuyameiju.controller;


import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import com.wuyameiju.common.CookieUtil;
import com.wuyameiju.entity.video;
import com.wuyameiju.model.deleteVideoMd;
import com.wuyameiju.model.imgMd;
import com.wuyameiju.model.linkPMd;
import com.wuyameiju.model.videoMd;
import com.wuyameiju.service.impl.videoServiceImpl;

@Controller
public class VideoController {

	@Autowired
	@Qualifier("VideoServiceImpl")
	private videoServiceImpl videoServiceImpl;
   
	@RequestMapping("/AddVideo.do")
	public @ResponseBody videoMd AddVideoService(@RequestParam(value = "file", required = false) MultipartFile _file,video _video,HttpServletRequest request)
			throws SQLException, IllegalStateException, IOException {
		
        String path = request.getSession().getServletContext().getRealPath("upload"); 
        //System.out.println(path);
        String originfileName = _file.getOriginalFilename(); 
        _video.setUserphone(CookieUtil.getCookieByName(request, "phone").getValue());      
        String fileName = new Date().getTime()+"."+originfileName.substring(originfileName.lastIndexOf(".") + 1);
        //_video.setImgsrc(path+"\\"+fileName);
        //System.out.println(fileName);
        //System.out.println(_video.getImgsrc());
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists())
        {  
            targetFile.mkdirs();  
        }  
        _video.setImgsrc("upload"+"\\"+fileName);
        //±£´æ  
        try {  
            _file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
       // model.addAttribute("fileUrl", request.getContextPath()+"/upload/"+fileName);  
  
     
		return videoServiceImpl.addVideo(_video);
	}
	
	@RequestMapping("/MyVideo.do")
	public @ResponseBody List<videoMd> MyVideo(String phone)
	{
		return videoServiceImpl.findByPhone(phone);
	}
	@RequestMapping("/showMyVideo.do")
	public String  ShowMyVideo()
	{
		
		return "video/myVideo";
	}
	
	@RequestMapping("/slide.do")
	public @ResponseBody List<imgMd> slide()
	{
		
		return videoServiceImpl.selectTop5Img();
	}
	@RequestMapping("/view.do")
	public @ResponseBody videoMd  View(Integer idVideo)
	{
		return videoServiceImpl.view(idVideo);
	}
	@RequestMapping("/view/jsp.do")
	public String  Redirect(Integer idVideo)
	{
		return "video";
	}
	
	@RequestMapping("/getLinkPass.do")
	public @ResponseBody linkPMd  getLinkPass(Integer idVideo)
	{
		return videoServiceImpl.findPassById(idVideo);
	}
	
	
	
	@RequestMapping("/deleteVideo.do")
	public @ResponseBody deleteVideoMd  DeletVideo(Integer idVideo,HttpServletRequest request)
	{
		return videoServiceImpl.deleteById1(idVideo, request);
	}
	
	
}
