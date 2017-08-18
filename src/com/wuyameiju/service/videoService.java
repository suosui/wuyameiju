package com.wuyameiju.service;

import java.sql.SQLException;
import com.wuyameiju.entity.video;
import com.wuyameiju.model.videoMd;

public interface videoService
{
	public videoMd addVideo(video _video) throws SQLException;

}
