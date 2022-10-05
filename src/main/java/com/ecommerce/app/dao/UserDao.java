package com.ecommerce.app.dao;

import com.ecommerce.app.entity.User;

public interface UserDao {

	void saveUser(User user);

	User authenticateUser(String name, String password);

}
