package com.abhinav.spring.springmvcorm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abhinav.spring.springmvcorm.user.entity.User;
import com.abhinav.spring.springmvcorm.user.services.UserService;


@Controller
public class UserController {

	@Autowired
	private
	UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	@RequestMapping("registration")
	public String showRegistrationPage() {
		return "userReg";
	}
	
	@RequestMapping(value="registerUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {

	    service.save(user);
		model.addAttribute("result","User Created With Id "+user);
		return "userReg";
	}

}
