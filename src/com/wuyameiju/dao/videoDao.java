package com.wuyameiju.dao;

import java.util.List;



import com.wuyameiju.model.videoMd;

public interface videoDao extends BaseDao<videoMd, Integer>
{

	public videoMd addVideo();
	public List<videoMd> findByphone(String phone);
	
}
