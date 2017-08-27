package com.cn.wmr.dao;

import com.cn.wmr.pojo.User_Status;

public interface IUserStatusDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User_Status record);

    int insertSelective(User_Status record);

    User_Status selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_Status record);

    int updateByPrimaryKey(User_Status record);
}