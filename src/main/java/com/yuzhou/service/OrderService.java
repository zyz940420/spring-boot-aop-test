package com.yuzhou.service;

import com.yuzhou.model.Order;

public interface OrderService {
	
	Order createOrder(String username,String product);
	
	Order query(String userName);

}
