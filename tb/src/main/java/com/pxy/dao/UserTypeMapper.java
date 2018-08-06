package com.pxy.dao;

import java.util.List;

import com.pxy.pojo.UserType;

public interface UserTypeMapper {
	int deleteByPrimaryKey(Integer typeid);

	int insert(UserType record);

	int insertSelective(UserType record);

	UserType selectByPrimaryKey(Integer typeid);

	int updateByPrimaryKeySelective(UserType record);

	int updateByPrimaryKey(UserType record);

	List<UserType> getUserType();
}