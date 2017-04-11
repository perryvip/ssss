package com.test.dao;

import com.test.entity.User;

public interface UserDao {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}