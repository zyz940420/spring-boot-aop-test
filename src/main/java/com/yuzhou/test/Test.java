package com.yuzhou.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import com.yuzhou.service.OrderService;

@Configuration
public class Test implements ApplicationContextAware{
	
	private ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
		System.out.println(context.toString());
		
		context.getBean(OrderService.class);
	}

}
