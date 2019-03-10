package com.kxx.a_proxy.b_cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyBeanFactory {
	
	public static UserServiceImpl createService() {
		
		final UserServiceImpl userServiceImpl = new UserServiceImpl();
		
		MyAspect myAspect = new MyAspect();
		
		Enhancer enhancer = new Enhancer();
		
		enhancer.setSuperclass(userServiceImpl.getClass());
		
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				myAspect.before();
				Object obj = method.invoke(userServiceImpl, args);
				methodProxy.invokeSuper(proxy, args);
				myAspect.after();
				return obj;
			}
		});

		UserServiceImpl userServiceImpl2 = (UserServiceImpl)enhancer.create();
		return userServiceImpl2;
	}

}
