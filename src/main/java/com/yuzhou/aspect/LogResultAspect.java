package com.yuzhou.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
public class LogResultAspect {
	
	@AfterReturning(pointcut="com.yuzhou.aspect.DefaultPointcutFactory.businessService()",returning="result")
	public Object logResult(Object result) {
		
		log.info("执行方法后，返回值：{}",result);
		
		return result;
	}

}
