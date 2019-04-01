package com.nana.retrofit.service.api.dao;

import com.nana.retrofit.service.api.dao.mapper.UserMapper;
import com.nana.retrofit.service.api.domain.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDAO {

	@Autowired
	protected  UserMapper mapper;
	
	public List<User> getListUser(){
		return mapper.getListUser();
	}
}
