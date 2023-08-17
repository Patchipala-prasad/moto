package com.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.AdminstratorDaoImp;
import com.jsp.entity.AdministratorEntity;


@Component
public class AdminstratorServiceImp implements AdminstratorService {

	@Autowired
	AdminstratorDaoImp dao;
	
	public AdministratorEntity findAdmin(String email, String password) {
		// TODO Auto-generated method stub
		AdministratorEntity object = dao.findAdmin(email, password);
		return object;
	}

}
