package com.yuzhou.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
public class DefaultPointcutFactory {
	
	@Pointcut("execution(* com.yuzhou..service.*.*(..))")
	public void businessService() {
		
		log.info("开始执行方法：{}","businessService");
		
	}

}
