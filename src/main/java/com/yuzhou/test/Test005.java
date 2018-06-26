package com.yuzhou.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuzhou.service.OrderService;
import com.yuzhou.service.UserService;

public class Test005 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context-5.xml");
		UserService userService = (UserService) context.getBean(UserService.class);
		OrderService orderService = context.getBean(OrderService.class);
		
		userService.createUser("zhang", "yuzhou", 20);
		userService.queryUser();
		
		orderService.createOrder("zhang", "zyz");
		orderService.query("zhang");
	}

}
