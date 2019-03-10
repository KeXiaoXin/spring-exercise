package com.kxx.c_inject.b_static_factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {
	
	@Test
	public void demo1() {
		UserService userService = MyBeanFactory.createService();
		userService.addUser();
	}
	
	@Test
	public void demo2() {
		String xmlPath = "com/kxx/c_inject/b_static_factory/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();
	}
	
	

}
