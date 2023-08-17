package com.jsp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jsp.entity.AdministratorEntity;



public class AdminstratorRowMapper implements RowMapper<AdministratorEntity> {

	public AdministratorEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		AdministratorEntity entity=new AdministratorEntity();
		entity.setAdminName(rs.getString("adminName"));
		entity.setAdminEmail(rs.getString("adminEmail"));
		entity.setAdminPassword(rs.getString("adminPassword"));
		return entity;
	}

}
