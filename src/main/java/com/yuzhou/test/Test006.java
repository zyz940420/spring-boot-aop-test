package com.yuzhou.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuzhou.service.UserService;

public class Test006 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context-6.xml");
		UserService userService = (UserService) context.getBean(UserService.class);
		
		userService.createUser("zhang", "yuzhou", 20);
		userService.queryUser();
		
	}

}
