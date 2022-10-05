package com.ecommerce.app.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.app.entity.Product;

@Service
public interface CartDao {

	public List<Product> getProducts();
	
	public void addProduct(Product product);
	
	public double getTotal();
	
	public void clearCart();

}
