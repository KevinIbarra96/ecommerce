package com.ecommerce.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.CartDao;
import com.ecommerce.app.entity.Product;

@Repository
public class CartDaoImpl implements CartDao{

	List<Product> cart = new ArrayList<>();
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return cart;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		if(exists(product)){		
			for(Product p : cart) {
				if(p.equals(product)) {
					p.setProducQuantity(p.getProducQuantity()+1);
					System.out.println(product + "added (+1) -CART DAO IMP-");
					return;
				}
			}
		} else {
			product.setProducQuantity(1);
			cart.add(product);
			System.out.println(product + "added (NEW) -CART DAO IMP-");
		}
		
	}
	
	private boolean exists(Product product) {
		for(Product p : cart) 
			if(p.equals(product))
				return true;
		return false;
	}

	@Override
	public double getTotal() {
		double total = 0;
		for(Product p : cart) 
			total += p.getPrice()*p.getProducQuantity(); 
		System.out.println("total: " + total);
		return total;
	}
	
	public void clearCart() {
		cart.clear();
	}
	
}
