package com.kxx.d_scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {
	
	@Test
	public void demo2() {
		String xmlPath = "com/kxx/c_inject/d_scope/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		UserService userService2 = (UserService) applicationContext.getBean("userServiceId");
		
		System.out.println(userService);
		System.out.println(userService2);
	}
	
	

}
