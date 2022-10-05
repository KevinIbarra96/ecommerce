package com.ecommerce.app;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.app.entity.Cart;
import com.ecommerce.app.entity.Purchase;
import com.ecommerce.app.service.HistoricService;

@Controller
public class HistoricController {
	
	@Autowired
	HistoricService historicService;
	
	
	@RequestMapping(value = "/showPurchases", method = RequestMethod.GET)
	public ModelAndView showHistoric(ModelAndView modelAndView, @RequestParam("userId") Integer userId) {
		List<Cart> purchases = historicService.getHistoric(userId);			
		
		modelAndView.addObject("purchases", purchases);
		modelAndView.addObject("userId", userId);
		modelAndView.setViewName("userhistoric");
		return modelAndView;
	}
	
	@RequestMapping(value="/addingPurchase", method = RequestMethod.GET)
	public ModelAndView addPurchase(Model model, ModelAndView modelAndView) {
		
		LocalDate myDate = LocalDate.now();
		
		Cart cart = (Cart) model.asMap().get("cart");	
				
		cart.setDate(myDate);
		
		historicService.addPurchase(cart);
		
		//for(Purchase p : historicService.getHistoric())
		//	System.out.println(p.getCart().getProducts());
		
		modelAndView.addObject("cart",cart.getProducts());
		modelAndView.addObject("total",cart.getTotal());
		modelAndView.addObject("userId",cart.getUserId());
		modelAndView.setViewName("purchaseconfirmation");		
		return modelAndView;
	}
	
}
