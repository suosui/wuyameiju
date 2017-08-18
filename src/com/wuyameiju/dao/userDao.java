package com.wuyameiju.dao;

import com.wuyameiju.entity.user;
import com.wuyameiju.model.*;

public interface userDao extends BaseDao<user, Integer> 
{
    public userMd AddUser(user _user);
    public String getPass(String _phone);
}
