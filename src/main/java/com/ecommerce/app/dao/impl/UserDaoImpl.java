package com.ecommerce.app.dao.impl;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.UserDao;
import com.ecommerce.app.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	static HashMap<String,User> userDatabase = new HashMap<>();
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveUser(User user) {		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public User authenticateUser(String name, String password) {
		User user = null;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		user =(User) session.createQuery("FROM User WHERE name = '"+name+"'").uniqueResult();
		session.getTransaction().commit();
		session.close();
		
		if(user == null) //caso: usuario no registrado
			return null;
		if (! (user.getPassword().equals(password))) { 
			User dummy = new User();
			dummy.setName(name);
			dummy.setPassword(null);
			return dummy;	
			}	
		return user;
	}

}

