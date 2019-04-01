package com.nana.retrofit.service.api.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nana.retrofit.service.api.domain.User;

@Mapper
public interface UserMapper {
	
	public List<User> getListUser();
	
}
