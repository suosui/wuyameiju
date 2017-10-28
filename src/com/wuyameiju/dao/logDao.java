package com.wuyameiju.dao;

import com.wuyameiju.entity.log;


public interface logDao extends BaseDao<log, Integer> {
   public  void addlog(log entity); 
}
