package com.ecommerce.app.dao;

import java.util.List;

import com.ecommerce.app.entity.Cart;

public interface HistoricDao {
	
	public void addPurchase(Cart cart);
	public List<Cart> getHistoric(Integer userId);
}
