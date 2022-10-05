package com.ecommerce.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.dao.HistoricDao;
import com.ecommerce.app.entity.Cart;
import com.ecommerce.app.service.HistoricService;

@Service
public class HistoricServiceImpl implements HistoricService{
	
	@Autowired
	HistoricDao historicDao;

	@Override
	public void addPurchase(Cart cart) {
		historicDao.addPurchase(cart);
	}

	@Override
	public List<Cart> getHistoric(Integer userId) {
		// TODO Auto-generated method stub
		return historicDao.getHistoric(userId);
	}
}
