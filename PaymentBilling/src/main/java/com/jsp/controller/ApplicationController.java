package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.entity.AdministratorEntity;
import com.jsp.service.AdminstratorServiceImp;

@Controller
@Component
public class ApplicationController {
	
@RequestMapping("/Adminstration")
public ModelAndView DisplayAdminstrative(){
	ModelAndView mv=new ModelAndView();
	mv.setViewName("AdministratorLogin");
	return mv;
	}
@Autowired
AdminstratorServiceImp service;


@RequestMapping("/performAdminstration")
public ModelAndView performAdminstration(@RequestParam("adminEmail")String adminEmail,@RequestParam("adminPassword") String adminPassword) {
	ModelAndView mv=new ModelAndView();
	AdministratorEntity admin = service.findAdmin(adminEmail, adminPassword);
	if(admin!=null)
	{
		mv.setViewName("AdminPersonal");
		return mv;
	}
	else {
		mv.setViewName("AdministratorLogin");
		mv.addObject("mes", "Sorry!UserName or Password Error.plz Enter proper details");
		return mv;
	}
}
@RequestMapping("/AdminPersonal")
public ModelAndView dispalyAdminPersonal()
{
	ModelAndView mv=new ModelAndView();
	mv.setViewName("AdminPersonal");
	return mv;
}
}
