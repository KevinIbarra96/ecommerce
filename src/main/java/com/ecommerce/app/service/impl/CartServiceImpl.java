package com.ecommerce.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.dao.CartDao;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartDao cartDao;

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return cartDao.getProducts();
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		cartDao.addProduct(product);
		
	}

	@Override
	public double getTotal() {
		return cartDao.getTotal();
	} 
	
	@Override
	public void clearCart() {
		cartDao.clearCart();
	}
}
