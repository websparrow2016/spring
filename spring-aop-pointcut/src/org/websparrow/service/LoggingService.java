package org.websparrow.service;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingService implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {

		System.out.println("............I'M EXECUTED BEFORE DEPOSIT METHOD...................");

	}
}
