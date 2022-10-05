package com.ecommerce.app.service;

import org.springframework.stereotype.Service;

import com.ecommerce.app.entity.User;

@Service
public interface UserService {

	void saveUser(User user);

	User authenticateUser(String name, String password);
	
}