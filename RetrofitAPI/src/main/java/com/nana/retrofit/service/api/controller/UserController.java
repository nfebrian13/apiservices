package com.nana.retrofit.service.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nana.retrofit.service.api.dto.APIResult;
import com.nana.retrofit.service.api.service.UserService;
import com.nana.retrofit.service.api.util.ErrorCode;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	protected UserService service;

	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
	public APIResult getEmployeeList() {

		APIResult apiresult = new APIResult();

		try {

			apiresult.setResult(service.getListUser());
			System.out.println(service.getListUser().size());

		} catch (Exception e) {
			ErrorCode errCode = ErrorCode.COMMON_ERROR;
			apiresult = new APIResult(errCode);
		}

		return apiresult;
	}
}
