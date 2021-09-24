package com.abhinav.spring.springmvcorm.user.services;

import java.util.List;

import com.abhinav.spring.springmvcorm.user.entity.User;

public interface UserService {
	int save(User user);
	List<User> getUser();
}
