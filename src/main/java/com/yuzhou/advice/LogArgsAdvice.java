package com.yuzhou.advice;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogArgsAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		log.info("准备执行方法：{}，参数列表：{}",method.getName(),Arrays.toString(args));
		
	}

}
