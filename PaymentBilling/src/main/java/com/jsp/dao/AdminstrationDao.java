package com.jsp.dao;

import com.jsp.entity.AdministratorEntity;

public interface AdminstrationDao {

	AdministratorEntity findAdmin(String email,String password);
}
