package com.yuzhou.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AdviceExample {
	
	@Around("com.yuzhou.aspect.DefaultPointcutFactory.businessService()")
	public Object doBasicProfiling(ProceedingJoinPoint joinPoint) throws Throwable {
		Object result = joinPoint.proceed();
		
		return result;
	}

}
