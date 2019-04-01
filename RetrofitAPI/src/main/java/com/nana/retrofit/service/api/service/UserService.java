package com.nana.retrofit.service.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.retrofit.service.api.dao.UserDAO;
import com.nana.retrofit.service.api.domain.User;

@Service
public class UserService {

	@Autowired
	protected UserDAO dao;

	public List<User> getListUser() {
		return dao.getListUser();
	}
	
}
