package com.kxx.b_bean_factory;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("之前");
		Object obj = mi.proceed();
		System.out.println("之后");
		return obj;
	}
	
}
