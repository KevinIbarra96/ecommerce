package com.ecommerce.app.dao.impl;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.ProductDao;
import com.ecommerce.app.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> getProducts() {

		List<Product> productsList = new ArrayList<>();

		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		productsList = session.createQuery("FROM Product").list();
		
		session.getTransaction().commit();
		session.close();

		System.out.println("Products queried from database");
		return productsList;
	}

	@Override
	public void deleteProduct(Product p) {
		// TODO Auto-generated method stub
//		for (Product pro : productsList) {
//			if (pro.equals(p)) {
//				if (pro.getProducQuantity() == 1)
//					productsList.remove(pro);
//				else
//					pro.setProducQuantity(pro.getProducQuantity() - p.getProducQuantity());
//			}
//		}

	}

	@Override
	public List<Product> getProductByName(String name) {
		List<Product> products = new ArrayList<>();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		products = session.createQuery("FROM Product WHERE productName = '"+name+"'").list();
		session.getTransaction().commit();
		session.close();
		return products;
	}
}
