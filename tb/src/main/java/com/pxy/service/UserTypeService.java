package com.pxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pxy.dao.UserTypeMapper;
import com.pxy.pojo.UserType;

@Service
public class UserTypeService {
	@Autowired
	private UserTypeMapper userTypeMapper;

	public List<UserType> getUserType() {
		return userTypeMapper.getUserType();
	}

}
