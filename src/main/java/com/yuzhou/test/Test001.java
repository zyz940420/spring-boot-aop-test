package com.yuzhou.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuzhou.service.UserService;

public class Test001 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context-1.xml");
		UserService userService = (UserService) context.getBean("userServiceProxy");
		
		userService.createUser("zhang", "yuzhou", 20);
		userService.queryUser();
	}

}
