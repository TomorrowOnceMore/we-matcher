package com.cn.wmr.dao;

import com.cn.wmr.pojo.User_Rights;

public interface IUserRightsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User_Rights record);

    int insertSelective(User_Rights record);

    User_Rights selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_Rights record);

    int updateByPrimaryKey(User_Rights record);
}