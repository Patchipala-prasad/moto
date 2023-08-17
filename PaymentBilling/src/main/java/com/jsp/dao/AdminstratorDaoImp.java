package com.jsp.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


import com.jsp.entity.AdministratorEntity;

@Component
public class AdminstratorDaoImp implements AdminstrationDao {

	@Autowired
	private JdbcTemplate template;
	public AdministratorEntity findAdmin(String email, String password) {
		// TODO Auto-generated method stub
		try {
		String sql="select *from administrator  where adminEmail=? and adminPassword=?";
		 
		AdministratorEntity object = template.queryForObject(sql,new AdminstratorRowMapper(),email,password);
		return object;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}

}
