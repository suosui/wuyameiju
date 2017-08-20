package com.wuyameiju.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;



import com.wuyameiju.beans.PageBean;
import com.wuyameiju.beans.QueryBean;
import com.wuyameiju.dao.videoDao;
import com.wuyameiju.entity.video;
import com.wuyameiju.model.imgMd;
import com.wuyameiju.model.linkPMd;
import com.wuyameiju.model.videoMd;


@Repository("VideoDaoImpl")
public class videoDaoImpl implements videoDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public Integer save(video entity) {
		// TODO Auto-generated method stub
		String sql = "insert into video(idvideo,userphone,videoname,date,imgsrc,link,linkpass) VALUES(default,?,?,default,?,?,?)";
		KeyHolder keyHolder = new GeneratedKeyHolder();  
	      int autoIncId = 0;  
		jdbcTemplate.update(new PreparedStatementCreator() {  
	        public PreparedStatement createPreparedStatement(Connection con)  
	                throws SQLException {  
	            PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);  
	            ps.setString(1,entity.getUserphone()); 
	            ps.setString(2, entity.getVideoname());
	            ps.setString(3, entity.getImgsrc());
	            ps.setString(4, entity.getLink());
	            ps.setString(5, entity.getLinkpass());
	            //ps.setString(2, (entity.getDate()).toString());
	            return ps;  
	        }  
	    }, keyHolder);  
		autoIncId = keyHolder.getKey().intValue();  
		return autoIncId;
	}

	

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		 int count = jdbcTemplate.update
				("delete from wuyameiju1.video where idVideo=?",id);
		 if(count==1)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	}
    
	
	
	public linkPMd findPassById(Integer id) {
		// TODO Auto-generated method stub
		linkPMd md=null;
		String sql="select video.idVideo,video.linkpass from wuyameiju1.video where video.idVideo="+id;
		List<linkPMd> videoMdList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<linkPMd>(linkPMd.class));
		if(null!=videoMdList&&videoMdList.size()>0){
		     md = videoMdList.get(0);
		}
	   return md;
	}


	@Override
	public videoMd addVideo() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<videoMd> findByphone(String phone) {
		// TODO Auto-generated method stub
		String sql = "SELECT video.userphone,video.idVideo,video.date,video.link,video.videoname FROM wuyameiju1.video WHERE video.userphone="+phone+" ORDER BY video.date DESC";
		 
		List<videoMd> mds = new ArrayList<videoMd>();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for ( Map row : rows) {
			videoMd md = new videoMd();
			md.setUserphone((String)row.get("userphone"));
			md.setIdVideo((Integer)row.get("idVideo"));
			md.setDate((Date)row.get("date"));
			md.setLink((String)row.get("link"));
			md.setVideoname((String)row.get("videoname"));
			mds.add(md);
		}
			
		return mds;

	}
	
	@SuppressWarnings("rawtypes")
	public List<imgMd> selectTop5Img()
	{
		String sql = "select video.idVideo, video.imgsrc from wuyameiju1.video where userphone='18844141934' ORDER BY video.date DESC limit 5";
		 
		List<imgMd> mds = new ArrayList<imgMd>();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for ( Map row : rows) {
			imgMd md = new imgMd();
			md.setIdVideo((Integer)row.get("idVideo"));
			md.setImgsrc((String)row.get("imgsrc"));
			mds.add(md);
		}
			
		return mds;

		
	}

	@Override
	public Integer save(videoMd entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(videoMd entity) {
		// TODO Auto-generated method stub
		
       
		return false;
	}
	
	

	@Override
	public boolean update(videoMd entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public videoMd findById(Integer id) 
	{
		videoMd md=null;
		String sql="select video.idVideo,video.date,video.link,video.videoname,video.imgsrc from wuyameiju1.video where video.idVideo="+id;
		List<videoMd> videoMdList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<videoMd>(videoMd.class));
		if(null!=videoMdList&&videoMdList.size()>0){
		     md = videoMdList.get(0);
		}
	   return md;	
	}
    
	


	@Override
	public List<videoMd> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public PageBean<videoMd> findByPage(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public PageBean<videoMd> findByPage(QueryBean queryBean, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}



	

	

	

}
