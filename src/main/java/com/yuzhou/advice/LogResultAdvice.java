package com.yuzhou.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogResultAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		log.info("方法返回：{}",returnValue);

	}

}
