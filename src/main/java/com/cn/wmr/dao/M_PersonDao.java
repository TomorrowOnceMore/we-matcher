package com.cn.wmr.dao;

import com.cn.wmr.pojo.M_Person;

public interface M_PersonDao {
    int deleteByPrimaryKey(Integer id);

    int insert(M_Person record);

    int insertSelective(M_Person record);

    M_Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(M_Person record);

    int updateByPrimaryKey(M_Person record);
}