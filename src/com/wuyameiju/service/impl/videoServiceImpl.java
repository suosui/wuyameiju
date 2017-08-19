package com.wuyameiju.service.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wuyameiju.dao.impl.videoDaoImpl;
import com.wuyameiju.entity.video;
import com.wuyameiju.model.imgMd;
import com.wuyameiju.model.videoMd;
import com.wuyameiju.service.videoService;
@Service("VideoServiceImpl")
public class videoServiceImpl implements videoService {
	@Autowired
    @Qualifier("VideoDaoImpl")
    private videoDaoImpl videoDao;
	
	
	@Transactional(readOnly = false, rollbackFor = DataAccessException.class)
	@Override
	public videoMd addVideo(video _video) throws SQLException {
		// TODO Auto-generated method stub
		videoMd Md = new videoMd();
    	Integer id = videoDao.save(_video);
    	if (id!=null) {
			Md.setIdVideo(id);
			Md.setUserphone(_video.getUserphone());
			Md.setVideoname(_video.getVideoname());
			Md.setLink(_video.getLink());
	    	Md.setDate(new Date());
    	}
		
    	return Md;
	}
	
	@Transactional(readOnly = true, rollbackFor = DataAccessException.class)
	public List<videoMd> findByPhone(String phone)
	{
		return videoDao.findByphone(phone);
	}
	
	
	@Transactional(readOnly = true, rollbackFor = DataAccessException.class)
	public List<imgMd> selectTop5Img()
	{
		return videoDao.selectTop5Img();
	}
	@Transactional(readOnly = true, rollbackFor = DataAccessException.class)
	public videoMd view(Integer id)
	{
		return videoDao.findById(id);
	}
}
