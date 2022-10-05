package com.ecommerce.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.app.entity.Cart;

@Service
public interface HistoricService {	
	public void addPurchase(Cart cart);
	public List<Cart> getHistoric(Integer userId);
	
}
