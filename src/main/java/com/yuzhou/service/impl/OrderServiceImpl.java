package com.yuzhou.service.impl;

import org.springframework.stereotype.Service;

import com.yuzhou.model.Order;
import com.yuzhou.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	private static Order order = new Order();

	@Override
	public Order createOrder(String username, String product) {
		order.setUserName(username);
		order.setProduct(product);
		return order;
	}

	@Override
	public Order query(String userName) {
		return order;
	}

}
