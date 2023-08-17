package com.jsp.service;

import com.jsp.entity.AdministratorEntity;

public interface AdminstratorService {
	AdministratorEntity findAdmin(String email,String password);

}
