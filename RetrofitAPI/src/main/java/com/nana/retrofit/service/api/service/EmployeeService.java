package com.nana.retrofit.service.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.retrofit.service.api.dao.EmployeeDAO;
import com.nana.retrofit.service.api.domain.Employee;

@Service
public class EmployeeService {

	@Autowired
	protected EmployeeDAO dao;

	public List<Employee> getEmployeeAll() {
		return dao.getEmployeeAll();
	}
}
