package com.ecom.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Cart;
import com.ecom.model.ProductOrder;
import com.ecom.repository.CartRepository;
import com.ecom.repository.ProductOrderRepository;
import com.ecom.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private ProductOrderRepository orderRepository;
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public ProductOrder saveOrder(Integer userId) {
		
		List<Cart> carts = cartRepository.findByUserId(userId);
		
		for(Cart cart:carts) 
		{
			
		}
		
		
		return null;
	}

}
