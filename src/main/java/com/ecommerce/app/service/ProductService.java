package com.ecommerce.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.app.entity.Product;

@Service
public interface ProductService {

	List<Product> getProductsList();
	public List<Product> getProductByName(String name);

}
