package com.ecommerce.app.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.app.entity.Product;

@Service
public interface ProductDao {

	List<Product> getProducts();
	void deleteProduct(Product p);
	public List<Product> getProductByName(String name);

}
