package com.yuzhou.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
public class LogArgsAspect {
	
	@Before("com.yuzhou.aspect.DefaultPointcutFactory.businessService()")
	public void logArgs(JoinPoint joinPoint) {
		
		log.info("执行方法前掉用，方法参数：{}",Arrays.toString(joinPoint.getArgs()));
		
	}

}
