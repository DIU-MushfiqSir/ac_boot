package com.project.accounting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.accounting.model.AppUser;
import com.project.accounting.services.AppUserService;

@Controller
public class AppUserController {
	
	@Autowired
	private AppUserService appUserService;
	
	@RequestMapping("/saveuser")
	public String saveUser(AppUser user) {
		
		appUserService.saveUser(user);
		
		return "user saveed!";
	}

}
